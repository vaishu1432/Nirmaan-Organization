package Day9;

public class Main {
	
	String stuName;
	int rollNo;
	Main(String stuName,int rollno){
		//this.stuName = stuName;
		//this.rollno = rollNo;
	}

	public static void main(String args[]) {
		Calculator Calc=new Calculator();
		Main s=new Main("Anitha",1001);
		System.err.println(s.stuName);
		System.out.println(s.rollNo);
		Calculator calc = new Calculator();
		Calc.Addition(10, 20);
		Calc.Subtraction(10, 20);
		Calc.Multiplication(10, 20);
		Calc.Divition(10, 20);
		Calc.Moduls(10, 20);
	}
}


