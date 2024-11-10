package Tests;

import Entities.Film;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserFilm {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = """
{
  "id": "tt1801045",
  "pays": {
    "nom": "United States",
    "url": "/search/title/?country_of_origin=US&ref_=tt_dt_cn"
  },
  "nom": "Cowboy Ninja Viking",
  "url": "/title/tt1801045/?ref_=nm_flmg_act_1",
  "plot": "A government program turns Duncan, a man who suffers from multiple personality disorder, into a super-soldier with the attributes of a cowboy, a ninja, and a Viking.",
  "langue": "English",
  "lieuTournage": null,
  "realisateurs": [
    {
      "identite": "Michelle MacLaren",
      "url": "/name/nm0533713/?ref_=tt_ov_dr"
    }
  ],
  "castingPrincipal": [
    {
      "id": "nm1231899",
      "identite": "Priyanka Chopra Jonas",
      "naissance": {
        "dateNaissance": "1982-7-18",
        "lieuNaissance": "Jamshedpur, Bihar, India"
      },
      "url": "/name/nm1231899/?ref_=tt_ov_st",
      "height": null,
      "roles": []
    },
    {
      "id": "nm0695435",
      "identite": "Chris Pratt",
      "naissance": {
        "dateNaissance": "1979-6-21",
        "lieuNaissance": "Virginia, Minnesota, USA"
      },
      "url": "/name/nm0695435/?ref_=tt_ov_st",
      "height": null,
      "roles": []
    }
  ],
  "anneeSortie": "",
  "roles": [
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
    },
    {
      "characterName": "Duncan",
      "acteur": {
        "id": "nm0695435",
        "identite": "Chris Pratt",
        "naissance": {
          "dateNaissance": "1979-6-21",
          "lieuNaissance": "Virginia, Minnesota, USA"
        },
        "url": "/name/nm0695435?ref_=tt_cl_t_1",
        "height": null,
        "roles": []
      },
      "film": "tt1801045"
    }
  ],
  "genres": ["Action", "Adventure", "Comedy"]
}
""";

        ObjectMapper objectMapper = new ObjectMapper();

        Film film1 = objectMapper.readValue(jsonString, Film.class);

        System.out.println("ID Film : " + film1.getId());
        System.out.println("Année de sortie : " + film1.getAnneeSortie());
        System.out.println("Réalisateur 1 : " + film1.getRealisateurs().getFirst().getIdentite());
        System.out.println("Genre 1 : " + film1.getGenres().getFirst().getNom());
        System.out.println("Casting principal 1 : " + film1.getActeurs().getFirst().getIdentite());
        System.out.println("Pays du lieu de tournage : " + film1.getLieu());
        System.out.println("URL : " + film1.getUrl());
        System.out.println("Acteur du rôle 1 : " + film1.getRoles().getFirst().getActeur().getIdentite());
    }
}
