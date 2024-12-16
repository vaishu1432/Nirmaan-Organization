package day16;


class Dog implements IAnimal{
	@Override

	public void move() {
		System.out.println("The dog runs on four leg");
		
	}
	@Override
	public void Speak() {
		System.out.println("The dag says:Woof Woof!");
	}
}

class Bird implements IAnimal {
	public void move() {
		System.out.println("The birf flyes in the sky");
	}
	public void Speack() {
		System.out.println("The bird says:Chirp Chirp!");
	}
}

public interface Animal  {
	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.move();
		dog.Speak();
		System.out.println(IAnimal.name);
		Bird bird = new Bird();
		bird.move();
		bird.Speack();
		System.out.println(IAnimal.isMammal("Dog"));
		System.out.println(IAnimal.name);
	}
	
}
