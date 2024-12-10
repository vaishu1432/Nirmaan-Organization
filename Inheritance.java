package day13;

class Animals {
void makesound () {
	System.out.println("This animal makes a sound");
}
}
class Dog extends Animals {
	@Override
	void makesound() {
		System.out.println("The dog barks");
	}
}

class Cat extends Animals {
	@Override
	void makesound () {
		System.out.println("The cat meows");
	}
}

public class Inheritance {
	public static void main(String[]args) {
		
		Dog D=new Dog();
		Cat C=new Cat();
		D.makesound();
		C.makesound();
	}
}
