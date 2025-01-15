// Sequence of parameters are deifferent 


class MethodOverloading3{
	void show(int a, String b){
		System.out.println("Nebulla");
	}
	void show(String b, int a){
		System.out.println("Technology");
	}
	public static void main(String[] args){
		MethodOverloading3 obj=new MethodOverloading3();
		obj.show(1,"abc");
		obj.show("abc",2); 
	}
}