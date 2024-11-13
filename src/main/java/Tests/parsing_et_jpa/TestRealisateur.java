package Tests.parsing_et_jpa;

import Entities.RealisateurE;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestRealisateur {
    public static void main(String[] args) throws JsonProcessingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        String jsonString = "{\"identite\":\"Aaron Horvath\",\"url\":\"/name/nm1739338/?ref_=tt_ov_dr\"}";
        String jsonString2 = "{\"identite\":\"Aaron Horvath\",\"url\":\"/name/nm1739338/?ref_=tt_ov_dr\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        RealisateurE realisateur1 = objectMapper.readValue(jsonString, RealisateurE.class);
        RealisateurE realisateur2 = objectMapper.readValue(jsonString2, RealisateurE.class);

        System.out.println("Nom du réalisateur : " + realisateur1.getIdentite());
        System.out.println("URL : " + realisateur2.getUrl());

        System.out.println("Pas de doublon : " + (realisateur1 == realisateur2));

        em.persist(realisateur1);
        em.persist(realisateur2);
        transaction.commit();
        em.close();
        emf.close();
    }
}
