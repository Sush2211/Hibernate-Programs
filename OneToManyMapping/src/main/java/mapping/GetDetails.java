package mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Sim s");
		List<Sim> l=q.getResultList();
		System.out.println("Below are the sim details..");
		for(Sim s:l) {
			System.out.println("SimId:"+s.getSimId());
			System.out.println("Network:"+s.getNetwork());
			System.out.println("ServiceProvider:"+s.getServiceProvider());
			System.out.println("-----------------------------------");
		}
		System.out.println("___________________________________");
		Query q1=em.createQuery("select m from Mobile m");
		List<Mobile> l1=q1.getResultList();
		System.out.println("Below are the mobile details..");
		for(Mobile m:l1) {
			System.out.println("MobileID:"+m.getMobileId());
			System.out.println("Brand:"+m.getBrand());
			System.out.println("Cost:"+m.getCost());
			System.out.println("Sim Details:"+m.getSim());
			System.out.println("--------------------------------------");
		}
		
	
	}

}
