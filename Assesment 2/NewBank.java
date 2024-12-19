package day14;
import java.util.Scanner;
public class NewBank {



	public static void main(String args[]) {
		Bank bank =new Bank();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your pin");
		int pin = scan.nextInt();
		if(pin==bank.getPin()) {
			boolean True=true;
			while(True) {
				System.out.println("Enter your choice");
				System.out.println("Enter 1 for widthdraw ");
				System.out.println("Enter 2 for deposite");
				System.out.println("Enter 3 for show");
				System.out.println("Enter 0 for exit");
				int option=scan.nextInt();
					if(option==1){
						System.out.println("Enter the widthraw amount");
						int amount = scan.nextInt();
						if( amount <=bank.getBalance()) {	
						System.out.println("Transaction completed");
						bank.setBalance(bank.getBalance()-amount);
					}
					else if (amount>=bank.getBalance()) {
						System.out.println("Insufficiant balance");
					}
					}
				
					if (option==2) {
						System.out.println("Enter deposit amount");
						int amount = scan.nextInt();
						bank.setBalance(bank.getBalance()+amount);
						System.out.println("Deposite successful");
					}
					if (option==3) {
						System.out.println(bank);
						
					}
					if(option==0) {
						True=false;
						System.out.println("thank you");
					}
					
			}
		}
				else {
				System.out.println("invaild pin");
			}

		}
		}


