// CE TEST TESTE SEULEMENT LE JPA, PAS LE PARSING (VOIR TEST FILM POUR CELA)

package Tests.parsing_et_jpa;

import Entities.GenreE;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestGenre {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        GenreE genreE1 = new GenreE("Aventure");

        em.persist(genreE1);
        transaction.commit();
        em.close();
        emf.close();
    }
}
