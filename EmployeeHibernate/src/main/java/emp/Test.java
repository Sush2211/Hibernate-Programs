package emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush"); // This class will connect to the persistence file
		EntityManager em=emf.createEntityManager();//to perform CRUD operations
		EntityTransaction et=em.getTransaction();
		Employee e=new Employee();
//		e.setId(1);
//		e.setName("sush");
//		e.setEmailid("sush@gmail.com");
//		e.setPhno(999994444);
		e.setId(2);
		e.setName("sita");
		e.setEmailid("sita@gmail.com");
		e.setPhno(999995544);
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Data inserted..");
	}
}
