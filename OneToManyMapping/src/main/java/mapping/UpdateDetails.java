package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s=em.find(Sim.class, 101);
		s.setNetwork("3G");
		System.out.println(s.getNetwork());
		
		Mobile m=em.find(Mobile.class, 2);
		m.setCost(20000);
		System.out.println(m.getCost());
		
		et.begin();
		em.merge(s);
		em.merge(m);
		et.commit();
		
		System.out.println("Data updated successfully..");
	}

}
