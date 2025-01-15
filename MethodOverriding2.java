class MethodOverriding2{
	void show(String a){
		System.out.println("1");
	}
}
	class Abc extends MethodOverriding2{
		void show(){
			System.out.println("2");
		}
		public static void main(String [] args){
			Abc obj1=new Abc();
			obj1.show();
			//MethodOverriding2 obj=new MethodOverriding2();
			//obj.show();
		}
	}