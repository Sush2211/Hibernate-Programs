package watch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Watch w=new Watch();
		w.setBrand("Titan");
		w.setCost(5000);
		
//		w.setBrand("Fasttrack");
//		w.setCost(3000);
		
//		w.setBrand("Fossil");
//		w.setCost(2500);
//		
//		w.setBrand("Calvin Klien");
//		w.setCost(10000);
		
		et.begin();
		em.persist(w);
		et.commit();
	}
}
