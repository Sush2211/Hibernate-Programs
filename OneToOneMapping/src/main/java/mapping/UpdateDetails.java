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
	
	AdharCard a=em.find(AdharCard.class, 111);
	a.setPincode(560043);;
	System.out.println(a.getPincode());
	
	Person p=em.find(Person.class,2);
	p.setName("def");
	System.out.println(p.getId());
	
	et.begin();
	em.merge(p);
	em.merge(a);
	et.commit();
	
	System.out.println("Data updated successfully..");
	
	
	}

}
