package mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select b from Bank b");
		List<Bank> l=q.getResultList();
		System.out.println("Below are the Bank details..");
		for(Bank b:l) {
			System.out.println("BankId:"+b.getBankId());
			System.out.println("AccountNo:"+b.getAccountNo());
			System.out.println("Address:"+b.getAddress());
			System.out.println("BankName:"+b.getBankName());
			System.out.println("IFSCCode:"+b.getIfscCode());
			System.out.println("Person:"+b.getPerson());
			System.out.println("-----------------------------");
			
		}
		System.out.println("___________________________________");
		
		Query q1=em.createQuery("select p from Person p");
		List<Person> l1=q1.getResultList();
		System.out.println("Below are the Person details..");
		for(Person p:l1) {
			System.out.println("PersonId:"+p.getPersonId());
			System.out.println("Name:"+p.getName());
			System.out.println("Phno:"+p.getPhno());
			System.out.println("--------------------------------");
		}
	}

}
