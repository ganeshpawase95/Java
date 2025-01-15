//With argumment with return type


class WithargWithreturn{
	int add(int a, int b){
		return a+b;
	}
	public static void main(String [] args){
		WithargWithreturn obj= new WithargWithreturn();
		
		System.out.println(obj.add(10,20));
	}
}