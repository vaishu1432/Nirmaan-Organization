package day13;

class Animals {
void sound () {
	System.out.println("This animal makes a sound");
}
}
class Dog extends Animals {
	void makesound() {
		System.out.println("The dog barks");
	}
}

class Cat extends Animals {
	void makesound () {
		System.out.println("The cat meows");
	}
}

public class Main {
	public static void main(String[]args) {
		
		Dog D=new Dog();
		Cat C=new Cat();
		D.makesound();
		C.makesound();
	}
}
