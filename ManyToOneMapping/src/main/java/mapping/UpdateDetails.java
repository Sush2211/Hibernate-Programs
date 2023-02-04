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
		
		Person p=em.find(Person.class,2);
		p.setPhno(999991111);
		System.out.println(p.getPhno());
		
		Bank b=em.find(Bank.class, 2);
		b.setBankName("Axis");
		b.setIfscCode("Axis005");
		System.out.println(b.getBankName()+" "+b.getIfscCode());
		
		et.begin();
		em.merge(p);
		em.merge(b);
		et.commit();
		
		System.out.println("Data updated successfully..");
	}

}
