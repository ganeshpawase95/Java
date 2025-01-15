interface I1{
	void show();
}
interface I2{
	void display();
}
class Test implements I1,I2{
	public void show(){
		System.out.println("Nebulla");
	}
	public void display(){
		System.out.println("Technology");
	}
	public static void main(String[] args){
		Test obj=new Test();
		obj.show();
		obj.display();
	}
}