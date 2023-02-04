package watch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteWatchDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Watch w=em.find(Watch.class, 3);
		
		et.begin();
		em.remove(w);
		et.commit();
		
		System.out.println("Data deleted successfully..");
	}

}
