package Day7;

public class Convertion {
	String addition(int a , int b) {
		return "Addition ; "+(a+b);
		
	}
	String subtraction(int a , int b) {
		return "Subtraction ; "+(a-b);
	}
	
	String multiplication(int a , int b) {
		return "Multiplition ; "+(a*b);
	}
	
	String divition(int a , int b) {
		return "Divitiontion ; "+(a/b);
	}
	String moduls(int a , int b) {
		return "Moduls ; "+(a-b);
	}
	public static void main(String[] args) {
		Convertion add=new Convertion();
		String number =add.addition(10,15);
	    System.out.println(number);
		String sub =add.subtraction(10,15);
	    System.out.println(sub);
	    String mul =add.multiplication(10,15);
	    System.out.println(mul);
	    String div =add.divition(10,15);
	    System.out.println(div);
	    String mod =add.moduls(10,15);
	    System.out.println(mod);
	}

}
