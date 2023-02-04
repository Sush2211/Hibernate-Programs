package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Mobile m=em.find(Mobile.class, 3);
		System.out.println("Below are the mobile details..");
		if(m!=null) {
			System.out.println("MobileID:"+m.getMobileId());
			System.out.println("Brand:"+m.getBrand());
			System.out.println("Cost:"+m.getCost());
			System.out.println("Sim Details:"+m.getSim());
			System.out.println("--------------------------------------");
		}
		else {
			System.out.println("Invalid data..");
		}
		System.out.println("__________________________________________");
		
		Sim s=em.find(Sim.class, 104);
		System.out.println("Below are the sim details..");
		if(s!=null) {
			System.out.println("SimId:"+s.getSimId());
			System.out.println("Network:"+s.getNetwork());
			System.out.println("ServiceProvider:"+s.getServiceProvider());
			System.out.println("-----------------------------------");
		}
		else {
			System.out.println("Data not found..");
		}
	}

}
