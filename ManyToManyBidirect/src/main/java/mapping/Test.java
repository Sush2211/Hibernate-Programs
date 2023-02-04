package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setStudent_Name("Ram");
		s.setStudent_emailId("Ram@gmail.com");
		
		et.begin();
		em.persist(s);
		et.commit();
		
		System.out.println("Data inserted successfully..");

	}

}
