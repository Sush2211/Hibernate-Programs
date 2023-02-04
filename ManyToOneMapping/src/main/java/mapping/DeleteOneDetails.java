package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=em.find(Person.class, 2);
		Bank b1=em.find(Bank.class, 4);
		Bank b2=em.find(Bank.class, 5);
		Bank b3=em.find(Bank.class, 6);
		
		et.begin();
		em.remove(p);
		em.remove(b1);
		em.remove(b2);
		em.remove(b3);
		et.commit();
		
		System.out.println("Data deleted successfully..");
	}

}
