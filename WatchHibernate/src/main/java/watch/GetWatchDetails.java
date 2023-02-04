package watch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetWatchDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Watch w=em.find(Watch.class, 1);
		if(w!=null) {
			System.out.println("ID:"+w.getId());
			System.out.println("Brand:"+w.getBrand());
			System.out.println("Cost:"+w.getCost());
		}
		else {
			System.out.println("Data doesnot exist");
		}
	}

}
