package jana60.bank;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Inserisci nome del conto: ");
		String name = in.nextLine();
		
		Conto cliente1 = new Conto(name);
		
		System.out.println(cliente1);
		
		while(true) {
			
			System.out.println("Inserisci un valore in base a cosa desidera fare: ");
			System.out.println("1- voglio versare una somma");
			System.out.println("2- voglio prelevare una somma");
			System.out.println("3- ciao");
			
			int choice = in.nextInt();
			
			if (choice < 1 || choice > 3) {
				continue;
			}
			
			switch (choice) {
				
				case 1: {
					System.out.println("Quanto vuoi versare: ");
					int amount = in.nextInt();
					cliente1.putMoney(amount);
				}
				break;
				
				case 2: {
					System.out.println("Quanto vuoi prelevare: ");
					int amount = in.nextInt();
					boolean res = cliente1.getMoney(amount);
					System.out.println(res ? "ok" : "non hai abbastanza soldi");
				}
				break;
				default:
					System.out.println("addio");
					in.close();
			}
		}
	}
}
