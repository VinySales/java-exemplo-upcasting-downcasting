package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Vini1", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Vini2", 0.0, 500.0);
		
		//Upcasting
		//BusinessAcount é uma Account, por isso não tem problema
		//Superclasse recebendo uma subclasse
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Vini3", 1000.0, 50000.0);
		Account acc3 = new SavingsAccount(1004, "Vini4", 1000.0, 0.01);
		acc1.getBalance();
		
		//Downcasting
		//Subclasse recebendo uma Superclasse
		BusinessAcount bacc1 = (BusinessAcount) acc2;
		SavingsAccount sa1 = (SavingsAccount) acc3;
		//bacc1.loan(100.0)
		
		if (bacc1 instanceof BusinessAcount) {
			BusinessAcount b = (BusinessAcount) bacc1;
			b.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (sa1 instanceof SavingsAccount) {
			SavingsAccount s = (SavingsAccount) sa1;
			s.updateBalance();
			System.out.println("Updated!");
		}
		
	}

}
