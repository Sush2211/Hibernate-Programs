package stud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudentDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setId(2);
		s.setName("sush");
		s.setEmail("sush@gmail.com");
		s.setPhno(999997777);
		
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("Data updated");
	}
	

}
