//Heirarchical Inheritance

class Company{
	void name(){
		System.out.println("Accenture is a MNC company-");
	}
}

class Developer extends Company{
	void dev(){
		System.out.println("Some people are developer in this company.");
	}
}

class Tester extends Company{
	void test(){
		System.out.println("And some people are tester in this company.");
	}
}

class Employee1{
	public static void main(String[] args){
		Developer obj1 = new Developer();
		Tester obj2 = new Tester();
		obj1.name();
		obj1.dev();
		obj2.name();
		obj2.test();
		
	}
}