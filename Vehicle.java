class Vehicle{
	public int wheels;
	
	Vehicle(){
		this.wheels=4;
	}
	
}

class Car extends Vehicle{
	public static void main(String [] args){
		int hedlighth = 2;
		Car c=new Car();
		System.out.println(hedlighth);
		System.out.println(c.wheels);
	}
}
