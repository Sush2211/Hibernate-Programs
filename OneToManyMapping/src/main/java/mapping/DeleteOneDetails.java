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
	
	Sim s=em.find(Sim.class, 102);
	Mobile m=em.find(Mobile.class, 1);
	
	et.begin();
	em.remove(s);
	em.remove(m);
	et.commit();
	
	System.out.println("Data deleted successfully..");
	}
}
