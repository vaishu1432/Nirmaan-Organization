package Day10;

public class Car {
	
	String make;
	int Year;
	Car(){
		
		this.make="Unknow";
		this.Year=2000;
	}
	Car(String make){
		this.Year=Year;
		this.make=make;
	}
	Car(String make,int year){
		this.make=make;
		this.Year=Year;
	}
	
	void displayCardetails(){
		System.out.println(make);
		System.out.println(Year);
	}
	}

