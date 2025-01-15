//No off parameterns are different


class MethodOverloading1{
	void show(int a){
		System.out.println("1");
	}
	void show(){
		System.out.println("2");
	}
	public static void main(String[] args){
		MethodOverloading1 obj= new MethodOverloading1();
		obj.show();
	}
}