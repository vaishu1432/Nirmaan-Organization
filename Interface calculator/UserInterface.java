package day15;

import java.util.Scanner;
public class UserInterface {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Calculator calc = new Calculator();
		System.out.println("Enter value a");
		int a =sc. nextInt();
		System.out.println("Enter b value");
		int b =sc.nextInt();
		System.out.println("Addition :"+calc.add (a,b));
		System.out.println("Subtract :"+calc.sub (a,b));
		System.out.println("Multiply :"+calc.mul (a,b));
		System.out.println("Divition :"+calc.div (a,b));
	}

}
