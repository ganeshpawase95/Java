// Type of parameters are different


class MethodOverloading2{
	void show(int a){
		System.out.println(a);
	}
	void show(String b){
		System.out.println(b);
	}
	public static void main(String[] args){
		MethodOverloading2 obj = new MethodOverloading2();
		obj.show("Welcome");
	}
}