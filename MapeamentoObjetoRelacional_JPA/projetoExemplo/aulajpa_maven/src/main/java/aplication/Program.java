package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa(null, "Carlos silva", "carlos@gmamil.com");
		Pessoa p2 = new Pessoa(null, "Ana vitoria", "Ana@gmamil.com");
		Pessoa p3 = new Pessoa(null, "julia mara", "juliaMaria@gmamil.com");
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto ");
		
		em.close();
		emf.close();
		
	}
}
