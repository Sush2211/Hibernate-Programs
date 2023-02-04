package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.createQuery("delete from Person").executeUpdate();
		em.createQuery("Delete from AdharCard").executeUpdate();
		et.commit();
		
		System.out.println("Data deleted successfully..");
	}

}
