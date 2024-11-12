package main;

import bo.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Film film = new Film("TestID","Le film de test","blablabla.com","C'est l'histoire d'un pinguin","Belge","2019");

        em.persist(film);

        Pays pays1 = new Pays("France","Tchitchat");
        em.persist(pays1);
        Lieu lieu1 = new Lieu("Lyon","France",pays1);
        em.persist(lieu1);
        Naissance naissance1 = new Naissance(LocalDate.now(),lieu1);
        em.persist(naissance1);
        Acteur acteur1 = new Acteur("MB14","Jean Moulin","URLJESAISPAS",0,naissance1);
        em.persist(acteur1);
        transaction.commit();
        em.close();
        emf.close();
    }
}
