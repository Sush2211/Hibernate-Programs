package cust;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Customer c=new Customer();
		c.setName("Ram");
		c.setEmailId("Ram@gmail.com");
		c.setLocalDateTime(LocalDateTime.now());
		
		et.begin();
		em.persist(c);
		et.commit();
		
		System.out.println("Data inserted successfully");
	}

}
