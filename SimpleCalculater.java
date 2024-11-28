package Day2;

import java.util.Scanner;

public class SimpleCalculater {
public static void main(String args[]){
	Scanner Sc=new Scanner (System.in);
       int key=Sc.nextInt();
	System.out.println("Enter your choice");
	System.out.println("0 for add");
	System.out.println("1 for sub");
	System.out.println("2 for mul");
	System.out.println("3 for div");
	System.out.println("4 for mod");
	
	
//	int key = Sc.nextInt();
//	if (key==0) {
//		int total = FirstNum + SecondNum;
//		System.out.println("Addition :"+total);
//		}else if (key==1) {
//			int total = FirstNum - SecondNum;
//			System.out.println("total :"+total);
//			
//		}else if (key==2) {
//			int total = FirstNum*SecondNum;
//			System.out.println("total :"+total);
//			
//		}else if (key==3) {
//			int total = FirstNum/SecondNum;
//			System.out.println("total :"+total);
//		}else if (key==4) {
//			int total = FirstNum%SecondNum;
//					System.out.println("total :"+total);
//		else  {
//	System.out.println("Enter yourCurrect choice");
//	
//	
	boolean isTrue=true;
	while(isTrue)
	switch (key) {
	case 0:  {
	System.out.println("Addition");
	System.out.println("Enter The FirstNum");
	int FirstNum=Sc.nextInt();
	System.out.println("Enten The SecondNum");
	int SecondNum = Sc.nextInt();
	int total=FirstNum+SecondNum;
	System.out.println("Total");
	break;
	}
	case 1: {
		System.out.println("Subtraction");
		System.out.println("Enter The FirstNum");
		int FirstNum=Sc.nextInt();
		System.out.println("Enten The SecondNum");
		int SecondNum=Sc.nextInt();
		int total=FirstNum-SecondNum;
		System.out.println("Total");
		break;
	}
	case 2:{
		System.out.println("Multiplicatiopn");
		System.out.println("Enter The FirstNum");
		int FirstNum=Sc.nextInt();
		System.out.println("Enten The SecondNum");
		int SecondNum=Sc.nextInt();
		int total=FirstNum*SecondNum;
		System.out.println("Total");
		break;
	}
	case 3:{
		System.out.println("Divition");
		System.out.println("Enter The FirstNum");
		int FirstNum=Sc.nextInt();
		System.out.println("Enten The SecondNum");
		int SecondNum=Sc.nextInt();
		int total=FirstNum/SecondNum;
		System.out.println("Total");
		break;
	}
	case 4:{
		System.out.println("Module");
		System.out.println("Enter The FirstNum");
		int FirstNum=Sc.nextInt();
		System.out.println("Enten The SecondNum");
		int SecondNum=Sc.nextInt();
		int total=FirstNum%SecondNum;
		System.out.println("Total");
		break;
		
	}
	 default:
		 System.out.println("Enter your currec choice");

	}
	

}
}
