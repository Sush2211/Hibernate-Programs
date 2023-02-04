package map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();

		
		Person p=em.find(Person.class, 1);
		System.out.println("Below are the person details..");
		if(p!=null) {
			System.out.println("PersonId:"+p.getPersonId());
			System.out.println("Name:"+p.getName());
			System.out.println("Phno:"+p.getPhno());
			System.out.println("BankId:"+p.getBank());
			System.out.println("--------------------------------");
		}
		else {
			System.out.println("Data not found");
		}
		
		Bank b=em.find(Bank.class, 102);
		System.out.println("Below are the bank details..");
		if(b!=null) {
			System.out.println("BankId:"+b.getBankId());
			System.out.println("AccountNo:"+b.getAccountNo());
			System.out.println("Address:"+b.getAddress());
			System.out.println("BankName:"+b.getBankName());
			System.out.println("IFSCCode:"+b.getIfscCode());
			System.out.println("-----------------------------");
		}
		
	}

}
