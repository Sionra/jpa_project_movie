package Tests;

import Entities.Role;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserRole {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = """
    {
      "characterName": "",
      "acteur": {
        "id": "nm1231899",
        "identite": "Priyanka Chopra Jonas",
        "naissance": {
          "dateNaissance": "1982-7-18",
          "lieuNaissance": "Jamshedpur, Bihar, India"
        },
        "url": "/name/nm1231899?ref_=tt_cl_t_2",
        "height": null,
        "roles": []
      },
      "film": "tt1801045"
}
""";

        ObjectMapper objectMapper = new ObjectMapper();

        Role role = objectMapper.readValue(jsonString, Role.class);

        System.out.println("Id du rôle : " + role.getId());
        System.out.println("Nom du personnage : " + role.getNom_personnage());
        System.out.println("Id de l'acteur : " + role.getActeur().getId());
        System.out.println("Nom de l'acteur : " + role.getActeur().getIdentite());
        System.out.println("Date de naissance : " + role.getActeur().getNaissance().getDateNaissance());
        System.out.println("Ville de naissance : " + role.getActeur().getNaissance().getLieu().getVille());
        System.out.println("URL : " + role.getActeur().getUrl());
        System.out.println("Taille : " + role.getActeur().getHeight());
        System.out.println("Rôles : " + role.getActeur().getRoles());
        System.out.println("ID du film : " + role.getFilmId());
    }
}
