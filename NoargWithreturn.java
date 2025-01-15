//With Return type No argumment 

class NoargWithreturn{
	int add(){
		int a=10;int b=20;
		return a+b;
	}
	public static void main(String [] args){
		NoargWithreturn obj = new NoargWithreturn();
		System.out.println(obj.add());
		
	}
}