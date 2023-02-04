package map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b1=em.find(Bank.class, 104);
		Bank b2=em.find(Bank.class, 105);
		Bank b3=em.find(Bank.class, 106);
		
		Person p=em.find(Person.class, 2);
		
		et.begin();
		em.remove(b1);
		em.remove(b2);
		em.remove(b3);
		em.remove(p);
		et.commit();
		
		System.out.println("Data deleted successfully..");
		
	}

}
