package day21;
import java.util.Scanner;
import java.util.ArrayList;
public class BookInterface {
	public static void main(String[] args) {
		Book book = new Book();
		ArrayList<Book> al= new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		boolean work=true;
		while (work) {
		System.out.println("Enter your Choice");
		System.out.println("1 for add :");
		System.out.println("2 for Update");
		System.out.println("3 for View");
		System.out.println("4 for Remove");
		System.out.println("0 for Exit");
		int key = sc.nextInt();
		sc.nextLine();
		if (key==1) {
			System.out.println("Enter the book id");
			int id =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the book name");
			String name = sc.nextLine();
			System.out.println("Enter the Author ");
			String author =sc.nextLine();
			System.out.println("Enter the Price");
			double price = sc.nextDouble();
			System.out.println("Enter the NoOfCopies");
			int copies = sc.nextInt();
			al.add( book = new Book(id,name,author,price,copies));
	
		}else if(key==2) {
			System.out.println("Enter the book id");
			int id =sc.nextInt();
			sc.nextLine();
			boolean isThere=false;
			for (Book book1 :al) {
			if (id==book1.getId()) {
			System.out.println("Enter the name");
			String name = sc.nextLine();
			book1.setName(name);
			System.out.println("Enter the Author");
			String author = sc.nextLine();
			book1.setAuthor(author);
			System.out.println("Enter the Price");
			double price = sc.nextDouble();
			book1.setPrice(price);
			System.out.println("Enter the copies");
			int copies = sc.nextInt();
			book1.setCopies(copies);
			break;
				}
				
				}
			if(!isThere) {
				System.out.println("Book Not There");
			}
		}
				else if(key==3) {
					System.out.println(al);
				}
				else if(key==4) {
					
					System.out.println("Enter the book id");
					int id =sc.nextInt();
					for (Book book1 :al) {
						if (id==book1.getId()) {
							al.remove(book1);
						}
							
					}
				}
				else if(key==0) {
					work=false;
					System.out.println("The End");
				}
			
					else {
						work=false;
						System.out.println("Enter the choice");
					}
	
		}
		}
	}


