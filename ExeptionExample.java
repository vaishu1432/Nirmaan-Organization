package day17;

import java.util.Scanner;
public class ExeptionExample {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a the value");
			int a= sc.nextInt();
			System.out.println("Enter the b value");
			int b=sc.nextInt();
					System.out.println("Add:"+(a+b));
					System.out.println("sub:"+(a-b));
					System.out.println("mul:"+(a*b));
					System.out.println("div:"+(a/b));
					System.out.println("Add:"+(a+b));
					System.out.println("Add:"+(a+b));
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
