class This3{
	This3(){
		System.out.println("No argument Constructor");
	}
	This3(int a){
		this();
		System.out.println("Parameterized Constructor.");
	}
	public static void main(String[] args){
		This3 t=new This3();
	}
}