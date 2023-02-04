package watch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateWatchDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Watch w=em.find(Watch.class, 2);
		w.setCost(25000);
		System.out.println(w.getCost());
		
		et.begin();
		em.merge(w);
		et.commit();
		
		System.out.println("Data updated successfully..");
	}

}
