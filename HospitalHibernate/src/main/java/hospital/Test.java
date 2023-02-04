package hospital;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital h=new Hospital();
		h.setName("Ravan");
		h.setEmailId("ravan@gmail.com");
		h.setPhno(999120793);
		h.setAddress("Bangalore");
		
		et.begin();
		em.persist(h);
		et.commit();
		
		System.out.println("Data inserted successfully..");
	}

}
