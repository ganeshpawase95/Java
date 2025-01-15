class BusTicket
{
	//System.out.println("Bus ticket booking convercation.");
	void ask(){
		System.out.println("Conductor= Where do you want to go?");
	}
	void ask1(){
		System.out.println("Conductor= 300 rupees.");
	}
	void ans(){
		System.out.println("Passenger= Mumbai");
	}
	void ans1(){
		System.out.println("Passenger= How much amount gave to buy the ticket?");
	}
	void ans2(){
		System.out.println("passenger= Okk. Gave me one ticket.");
	}
	public static void main(String[] args){
		BusTicket conductor = new BusTicket();
		BusTicket passenger = new BusTicket();
		conductor.ask();
		passenger.ans();
		passenger.ans1();
		conductor.ask1();
		passenger.ans2();
		
		
	}
}