package day16;

public interface IAnimal {
	
	String name ="Living Being";
	static boolean isMammal (String animalName) {
		return (animalName=="Dog")||(animalName=="Cat")||(animalName=="Human");
	}
	default void Speak() {
		System.out.println("Animal is making a sound");
		
	}
	void move();
}

