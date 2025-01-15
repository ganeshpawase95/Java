class Super1{
	int i=10;
}
class Child extends Super1{
	int i=20;
	void show(int i){
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args){
		Child c=new Child();
		c.show(30);
	}
}