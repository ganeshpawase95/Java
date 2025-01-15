//Multiple Inheritance


class Developer{
	void dev();
}

class Tester{
	void test();
}

class Company extends Developer, Tester{
	void dev(){
		System.out.println("In this company Software developer works.");
	}
	void test(){
		System.out.println("In this company Tester also works.");
	}
}

class Employee2{
	public static void main(String [] args){
		Company com = new Company();
		com.dev();
		com.test();
	}
}