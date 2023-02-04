package map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b1=new Bank();
		b1.setBankId(104);
		b1.setBankName("HDFC");
		b1.setIfscCode("HDFC001");
		b1.setAddress("Bangalore");
		b1.setAccountNo(10001);
		
		Bank b2=new Bank();
		b2.setBankId(105);
		b2.setBankName("SBI");
		b2.setIfscCode("SBI001");
		b2.setAddress("PUNE");
		b2.setAccountNo(10002);
		
		Bank b3=new Bank();
		b3.setBankId(106);
		b3.setBankName("ICICI");
		b3.setIfscCode("ICICI001");
		b3.setAddress("Hyderabad");
		b3.setAccountNo(10003);
		
		List<Bank> banks=new ArrayList<Bank>();
		banks.add(b1);
		banks.add(b2);
		banks.add(b3);
		
		Person p=new Person();
		p.setName("Ram");
		p.setPhno(999988888);
		p.setBank(banks);
		
		et.begin();
		em.persist(p);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
		
		System.out.println("Data inserted successfully..");
		
		
	}
}
