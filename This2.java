class This2{
	void display(){
		System.out.println("Hello");
	}
	void show(){
		this.display();
	}
	public static void main(String [] args){
		This2 t=new This2();
		t.show();
	}
}