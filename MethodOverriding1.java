//same parameters

class MethodOverriding1{
	void show(){
		System.out.println("1");
	}
}
	class Abc extends MethodOverriding1{
		void show(){
			System.out.println("2");
		}
		public static void main(String [] args){
			Abc obj1=new Abc();
			obj1.show();
			MethodOverriding1 obj=new MethodOverriding1();
			obj.show();
		}
	}
