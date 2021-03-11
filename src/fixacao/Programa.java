package fixacao;

import java.util.Scanner;

import entities.Account;
import model.exception.DomainException;

public class Programa {

	public static void main(String[] args) throws DomainException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
		System.out.print("number: ");
		int number = sc.nextInt();
		
		System.out.println("name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.println("Withdraw limit: ");
		Double withdrawlimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawlimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
					
			try {
				account.withdrawn(amount);
				System.out.println("new balence: " +String.format("%.2f",account.getBalance()));
			} 
			catch (DomainException e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}

			sc.close();
	}
}
