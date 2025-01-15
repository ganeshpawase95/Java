class Employee{
	int id;
	String name;
	String email;
	Employee(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public static void main(String args[]){
		Employee e1=new Employee(1,"Ganesh","itsganesh@gmail.com");
		Employee e2=new Employee(2,"Ritesh","ritesh@gmail.com");
		Employee e3=new Employee(3,"Sankalp","sankalpatil@gmail.com");
		
		System.out.println("	  __________________________________________");
		System.out.println("	  EmpId | EmpName | EmpEmail|");
		System.out.println("	  __________________________________________");
		System.out.println("Employee1 is: "+e1.id+" | "+e1.name+" | "+e1.email);
		System.out.println("Employee2 is: "+e2.id+" | "+e2.name+" | "+e2.email);
		System.out.println("Employee3 is: "+e3.id+" | "+e3.name+" | "+e3.email);
	}
	
}