package person;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter choice");
			System.out.println("1.Enter Person details\n2.Exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter ID");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
			
				Person p=new Person();
				p.setId(id);
				p.setName(name);
				p.setEmail(email);
				
				et.begin();
				em.merge(p);
				et.commit();
				
				break;
			case 2:
				System.out.println("Thank YOU");
				System.exit(0);
				break;

			default:
				System.out.println("INVALID CHOICE");
				System.out.println("--------------------");
				break;
			}
		}
	
	}

}
