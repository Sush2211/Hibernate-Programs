package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCarDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=em.find(Car.class, 2);
		c.setBrand("Audi");
		System.out.println(c.getBrand());
		
		et.begin();
		em.merge(c);
		et.commit();
		
		System.out.println("Data Updated successfully");
	}

}
