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
		
		Person p=new Person();
		p.setPersonId(2);
		p.setName("Raj");
		p.setPhno(1117865428);
		
		Bank b1=new Bank();
		b1.setAccountNo(1004);
		b1.setAddress("Bangalore");
		b1.setBankName("HDFC");
		b1.setIfscCode("HDFC001");
		b1.setPerson(p);
		
		Bank b2=new Bank();
		b2.setAccountNo(1005);
		b2.setAddress("Pune");
		b2.setBankName("SBI");
		b2.setIfscCode("SBI001");
		b2.setPerson(p);
		
		Bank b3=new Bank();
		b3.setAccountNo(1006);
		b3.setAddress("Hyderabad");
		b3.setBankName("ICICI");
		b3.setIfscCode("ICICI001");
		b3.setPerson(p);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(p);
		et.commit();
		
		System.out.println("Data inserted successfully..");
		
		
		
	}

}
