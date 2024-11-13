package Tests.parsing_et_jpa;

import Entities.GenreE;
import Entities.NaissanceE;
import ParsingClasses.Naissance;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class TestNaissance {
    public static void main(String[] args) throws JsonProcessingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        String jsonString1 = "{\"dateNaissance\": \"0-12-12\", \"lieuNaissance\": \"Jamshedpur, Bihar, India\"}";
        String jsonString2 = "{\"dateNaissance\": \"1964-10-25\", \"lieuNaissance\": \"Bronx, New York City, New York, USA\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Naissance naissance1 = objectMapper.readValue(jsonString1, Naissance.class);
        Naissance naissance2 = objectMapper.readValue(jsonString2, Naissance.class);

        System.out.println("ID de naissance : " + naissance1.getId());
        System.out.println("Date de naissance : " + naissance1.getDateNaissance());
        System.out.println("Ville de naissance : " + naissance1.getLieu().getVille());
        System.out.println("Région/Etat de naissance : " + naissance1.getLieu().getState());
        System.out.println("Pays de naissance : " + naissance1.getLieu().getPays());

        System.out.println("\nID de naissance : " + naissance2.getId());
        System.out.println("Date de naissance : " + naissance2.getDateNaissance());
        System.out.println("Quartier de naissance : " + naissance2.getLieu().getQuartier());
        System.out.println("Ville de naissance : " + naissance2.getLieu().getVille());
        System.out.println("Région/Etat de naissance : " + naissance2.getLieu().getState());
        System.out.println("Pays de naissance : " + naissance2.getLieu().getPays());

        System.out.println("\nAbsence de doublons : " + (naissance1 != naissance2));

        em.persist(naissance1);
        transaction.commit();
        em.close();
        emf.close();
    }
}