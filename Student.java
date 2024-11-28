package Day5;

public class Student {
	
		String StudentName = "";
		int RollNum = 0;
		String DOB ="";
		int Age = 0;
		
		public static void main (String args[]) {		
		Student Student1 = new Student();
		Student1.StudentName = "Abinaya";
		Student1.RollNum = 10001;
		Student1.DOB = "11-06-2003";
		Student1.Age = 21;
		
		System.out.println(Student1.StudentName);
		
		Student Student2 = new Student();
		Student1.StudentName = "Barathi";
		Student1.RollNum = 10002;
		Student1.DOB = "11-07-2003";
		Student1.Age = 20;
		
		System.out.println(Student1.Age);
	}

}
