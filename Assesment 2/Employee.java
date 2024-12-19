package day14;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[]args) {
		EmployeeManagement emp =new EmployeeManagement();
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
		switch(key){
		case 1 : {
			
			System.out.println("Enter the Employee Name");
			String empName =  sc.nextLine();
			System.out.println("Enyer the Employee Id");
			int empId = sc.nextInt();
			System.out.println("Enter Employee Department ");
			String empDept = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Employee Phone");
			int empPhone =  sc.nextInt();
			
			EmployeeManagement E = new EmployeeManagement(empName,empId,empDept,empPhone);
			break;
		}
case 2 : {
			
			System.out.println("Enter the Employee Name");
			String empName =  sc.nextLine();
			emp.setEmpName(empName);
			System.out.println("Enyer the Employee Id");
			int empId = sc.nextInt();
			emp.setEmpId(empId);
			System.out.println("Enter Employee Departmet ");
			String empDept = sc.nextLine();
			emp.setEmpDept(empDept);
			sc.nextLine();
			System.out.println("Enter the Employee Phone");
			int empPhone =  sc.nextInt();
			emp.setEmpPhone(empPhone);
			emp = new EmployeeManagement();
			break;
		}
case 3:{
	System.out.println(emp);
	break;
}
case 4 :{
	isTrue = false;
	System.out.println("Thank you");
	break;
}

default: {
	System.out.println("enter your choice");
	break;
}

		}
	}
	}
}