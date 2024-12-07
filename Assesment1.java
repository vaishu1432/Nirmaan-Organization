package Day9;

import java.util.Scanner;

//import java.util.Scanner;

//1.Write a java program to cast vote if age is greater than 18?
//import java.util.Scanner;
public class Assesment1 {
	//void vote(int age) {
		//if (age>=18) {
			//System.out.println("Your aligible for vote");
		//}
	
	//else{
		//System.out.println("Your not eligible vote");
		
	//}
	//}
	//public static void main(String[] args) {
		//Scanner Sc =new Scanner(System.in);
		//System.out.println("Enyer your age");
		//int age= Sc.nextInt();
		//Assesment1 S = new Assesment1();
		//S.vote(age);
		
	
//}
//}
	//2.Write a java program to print 1 to 100 such that every 4 multiples should be return as "jack". 
//void Jack(){
	//for(int i=1;i<=100;i++){
		//if (i%4==0) {
			//System.out.println("Jack");
		//}
		//else {
			//System.out.println(i);
		//}
	//}
//}
		//public static void main(String[] args) {
			//Assesment1 J=new Assesment1();
			//J.Jack();
		//}
//}

//3.write a java program to skip odd numbers from 1 to 70?

//void Odd () {
//	
//	for(int i=1;i<=70;i++) {
//	if(i%2!=0) {
//		continue;
//		
//	}
//	else {
//		System.out.println(i);
//	}
//	}
//}
//	public static void main(String[] args) {
//		Assesment1 Odd= new Assesment1 ();
//		Odd.Odd();
//	}
//}
		
		//4.Wrtite a java program to check given number is even or odd?
	
//	void number(int i) {
//		
//	 if(i%2==0) {
//		 System.out.println("Given the Even number");
//	 } else {
//		 System.out.println("Given the odd number");
//	 }
//			
//		}
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int i=scan.nextInt();
//		Assesment1 n=new Assesment1();
//		n.number(i);
//		}
//	}
	
		//5.Change given string to capital and small letters?
	
	
//		public static void main(String[]args) {
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Enter the String");
//			String name=scan.nextLine();
//			System.out.println(name.toUppercae());
//			System.out.println(name.toLowercase());
//			
//		}
//		}

	//6.If check mark student pass or fail?
//	
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		  System.out.println("Enter your mark");
//		int mark=scan.nextInt();
//		if (mark>=35); {
//			System.out.println("you are pass");
//		
//		}  
//		if (mark<=35) {
//			System.out.println("you are fail");
//		}
//			
//		
//	}
//	}
	
	//7.Calculate total and average mark using scanner?
	
//	void Student (int mark1,int mark2,int mark3,int mark4) {
//		int Total= mark1+mark2+mark3+mark4;
//		System.out.println("Student Total ="+(Total));
//		System.out.println("Student Average ="+(Total));
//		
//	}
//	public static void main(String []args) {
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter your tamil mark");
//		int mark1=sc.nextInt();
//		System.out.println("Enter your English mark");
//		int mark2=sc.nextInt();
//		System.out.println("Enter your Hindi mark");
//		int mark3=sc.nextInt();
//		System.out.println("Enter your Maths mark");
//		int mark4=sc.nextInt();
//		Assesment1  S=new Assesment1();
//		S.Student(mark1, mark2, mark3, mark4);
//		
//	}
//}
		
	//8Write a java program to check given given year is leap year or not?
	
	void leapYear(int year) {
		if(year%4==0);
		System.out.println("Given year leap year");
	}
	    {
		
		   System.out.println("Given year not leap year");
		
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int Year=sc.nextInt(); 
		Assesment1  S=new Assesment1();
		S.leapYear(Year);
	}	
}
	