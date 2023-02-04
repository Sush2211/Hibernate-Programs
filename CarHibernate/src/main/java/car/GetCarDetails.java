package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCarDetails {
	
	public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
	EntityManager em=emf.createEntityManager();
	
	Car c=em.find(Car.class, 3);
    System.out.println("Below are the car details..");
	if(c!=null) {
		System.out.println("ID :"+  c.getId());
		System.out.println("Brand :"+  c.getBrand());
		System.out.println("Color :"+  	c.getColor());
	}
	
	else {
		System.out.println("Data doesnot exist");
	}
	
	}
}