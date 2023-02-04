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
		
		Person p=em.find(Person.class, 1);
		AdharCard a=em.find(AdharCard.class, 101);
		
		et.begin();
		em.remove(p);
		em.remove(a);
		et.commit();
		
		System.out.println("Data deleted successfully");
	}

}
