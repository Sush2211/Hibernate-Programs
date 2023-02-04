package map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b=em.find(Bank.class, 103);
		b.setBankName("Axis");
		b.setIfscCode("Axis001");
		
		Person p=em.find(Person.class, 2);
		p.setName("Sita");
		p.setPhno(1111122222);
		
		et.begin();
		em.merge(p);
		em.merge(b);
		et.commit();
		
		System.out.println("Data updated successfully..");
	}

}
