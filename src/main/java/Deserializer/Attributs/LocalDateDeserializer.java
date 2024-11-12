package Deserializer.Attributs;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    private static final List<DateTimeFormatter> FORMATTERS = Arrays.asList(
            DateTimeFormatter.ofPattern("yyyy-MM-dd"),
            DateTimeFormatter.ofPattern("yyyy-M-d"),
            DateTimeFormatter.ofPattern("yyyy-MM-d"),
            DateTimeFormatter.ofPattern("yyyy-M-dd")
    );

    public LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String date = p.getText();

        if (date == null || date.trim().isEmpty()) {
            return null;
        }

        // Gestion du format "yyyy-0-0"
        if (date.matches("\\d{4}-0-0")) {
            int year = Integer.parseInt(date.substring(0, 4));
            return LocalDate.of(year, 1, 1); // Retourne le 1er janvier de l'année indiquée
        }
        // Gestion du format "yyyy-m-0" ou "yyyy-mm-0"
        else if (date.matches("^\\d{4}-\\d{1,2}-0$")) {
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(5, date.length() - 2).replaceAll("^0", ""));
            return LocalDate.of(year, month, 1); // Retourne le 1er jour du mois spécifié
        }

        // Gestion du format "yyyy-0-d" ou "yyyy-0-dd"
        else if (date.matches("^\\d{4}-0-\\d{1,2}$")) {
            int year = Integer.parseInt(date.substring(0, 4));
            int day = Integer.parseInt(date.substring(7).replaceAll("^0", ""));
            return LocalDate.of(year, 1, day); // Janvier comme mois par défaut
        }

        // Gestion des dates où l'année = 0, 00, 000 ou 0000
        else if (date.matches("^0{1,4}-\\d{1,2}-\\d{1,2}$")) {
            date = date.replaceFirst("^0{1,4}", "1111");
        }

        for (DateTimeFormatter formatter : FORMATTERS) {
            try {
                return LocalDate.parse(date, formatter);
            } catch (DateTimeParseException e) {
                //
            }
        }
        throw new IOException("Ce format de date n'est pas pris en charge : " + date);
    }
}