abstract class Vehicle1{
	int no_of_tyers;
	abstract void start();
}
class Car extends Vehicle1{
	void start(){
		int no_of_tyers=4;
		System.out.println("No of Tyers= "+no_of_tyers);
		System.out.println("Car start with Key.");
	}
}
class Bike extends Vehicle1{
	void start(){
		int no_of_tyers=2;
		System.out.println("No of Tyers= "+no_of_tyers);
		System.out.println("Bike start with Kick");
	}
public static void main(String[] args){
	Car c=new Car();
	c.start();
	Bike b=new Bike();
	b.start();
}
}