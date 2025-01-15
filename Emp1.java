//multilevel inheritance

class Compony{
	void name(){
		System.out.println("This is a development and service provider company.");
	}
}

class Employee extends Compony{
	void empname(){
		System.out.println("Ganesh is a Developer in that company.");
	}
}

class EmpSalary extends Employee{
	void salary(){
		System.out.println("The salary of developer in that company is 45000");
	}
}

class Emp1{
	public static void main(String [] args){
		EmpSalary obj = new EmpSalary();
		obj.name();
		obj.empname();
		obj.salary();
	}

}
