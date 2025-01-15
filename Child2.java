class Super3{
	Super3(){
		System.out.println("Hi");
	}
}
class Child2 extends Super3{
	Child2(){
		super();
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Child2 c=new Child2();
	}
}