class Super2{
	void display(){
		System.out.println("Nebulla");
	}
}
class Child1 extends Super2{
	int i=20;
	void show(int i){
		System.out.println(i);
		System.out.println(this.i);
		super.display();
	}
	public static void main(String[] args){
		Child1 c=new Child1();
		c.show(30);
	}
}