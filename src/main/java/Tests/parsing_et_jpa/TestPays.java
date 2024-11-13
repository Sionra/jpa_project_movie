package Tests.parsing_et_jpa;

import Entities.PaysE;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestPays {
    public static void main(String[] args) throws JsonProcessingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        String jsonString = "{ \"nom\": \"United States\", \"url\": \"/search/title/?country_of_origin=US&ref_=tt_dt_cn\" },";
        String jsonString2 = "{ \"nom\": \"United States\", \"url\": \"/search/title/?country_of_origin=US&ref_=tt_dt_cn\" }";

        ObjectMapper objectMapper = new ObjectMapper();

        PaysE pays1 = objectMapper.readValue(jsonString, PaysE.class);
        PaysE pays2 = objectMapper.readValue(jsonString2, PaysE.class);

        System.out.println("Nom du pays : " + pays1.getNom());
        System.out.println("URL : " + pays1.getUrl());

        System.out.println("Pas de doublon : " + (pays1 == pays2));

        em.persist(pays1);
        em.persist(pays2);
        transaction.commit();
        em.close();
        emf.close();
    }
}
