class Single{
	int empsalary = 35000;
}

class B extends Single{
	int empbonus = 10000;
	
}
class C{
	public static void main(String[] args){
		C c= new C();
		System.out.println(c.empsalary+c.empbonus);
	}
}