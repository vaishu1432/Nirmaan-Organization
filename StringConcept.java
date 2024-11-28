package Day5;
import java.util.Scanner;
public class StringConcept {
 
	
 public static void main(String args[]) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your name");
	 String name = sc.nextLine();
	 System.out.println(name.substring(0, 5));
 }
 
}
