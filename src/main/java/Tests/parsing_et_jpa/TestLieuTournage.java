package Tests.parsing_et_jpa;

import Entities.LieuTournageE;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestLieuTournage {
    public static void main(String[] args) throws JsonProcessingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        String jsonString1 = "{\"ville\":\"\",\"etatDept\":\"Paris\",\"pays\":\" France\"}";
        String jsonString2 = "{\"ville\":\"\",\"etatDept\":\"Paris\",\"pays\":\" France\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        LieuTournageE lieu1 = objectMapper.readValue(jsonString1, LieuTournageE.class);
        LieuTournageE lieu2 = objectMapper.readValue(jsonString2, LieuTournageE.class);

        System.out.println("ID : " + lieu1.getId());
        System.out.println("Nom du pays : " + lieu1.getPays());
        System.out.println("Etat/Région : " + lieu1.getEtat());
        System.out.println("Ville : " + lieu1.getVille());
        System.out.println("Quartier : " + lieu1.getQuartier());

        em.persist(lieu1);
        em.persist(lieu2);
        transaction.commit();
        em.close();
        emf.close();
    }
}
