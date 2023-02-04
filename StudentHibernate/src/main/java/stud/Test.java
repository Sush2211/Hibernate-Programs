package stud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xyz");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setId(2);
		s.setName("Ram");
		s.setEmail("Ram@gmail.com");
		s.setPhno(999997777);
		
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Data inserted");
	}

}
