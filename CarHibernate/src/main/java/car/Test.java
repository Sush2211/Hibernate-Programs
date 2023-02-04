package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setId(3);
		c.setBrand("Verito");
		c.setColor("White");
		
		et.begin();
		em.persist(c);
		et.commit();
	}

}
