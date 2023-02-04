package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sush");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		AdharCard a = new AdharCard();
		a.setAdharNo(113);
		a.setAddress("Bangalore");
		a.setPincode(560063);

		Person p = new Person();
		p.setName("Sita");
		p.setPhno(999938888);
		p.setAdhar(a);

		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();

		System.out.println("Data inserted successfully..");
	}

}
