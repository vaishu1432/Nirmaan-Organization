package day12;
import java.util.Scanner;
public class BookManagement {
	static Book book;
public static void main(String[]args) {
	Book book=new Book();
	Scanner sc=new Scanner(System.in);
	boolean isTrue =true;
	while (isTrue) {
	System.out.println("Enter your choice ");
	System.out.println("1 for Add");
	System.out.println("2 for Update ");
	System.out.println("3 for Display");
	System.out.println("0 exit");
	int key =sc. nextInt();
	sc.nextLine();
	
		switch(key) {
		
	case 1 : {
			
		System.out.println("Enter book title");
		String title =  sc.nextLine();
		System.out.println("Enyer book author");
		String author = sc.nextLine();
		System.out.println("Enter book price");
		double price = sc.nextDouble();
		System.out.println("copy");
		int copy =  sc.nextInt();
		book=new Book(title,author,price,copy);
		break;
	}
		
		case 2:{
			System.out.println("Enter book title");
			String title =  sc.nextLine();
			book.setTitle(title);
			
			System.out.println("Enter book author");
			String author = sc.nextLine();
			book.setAuthor(author);
			
			System.out.println("Enter book price");
			double price = sc.nextDouble();
			book.setPrice(price);
			
			System.out.println( "copy");
			int copy =  sc.nextInt();
			book.setCopies(copy);
			break;
		}
		case 3:{
			System.out.println(book);
		}
		case 4 :{
			isTrue = false;
			System.out.println("Thank you");
		}
		
		default: {
			System.out.println("enter your choice");
			break;
		}
		}
		
		}
	}
}

