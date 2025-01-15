//Single inheritance 

class Single{
	int empsalary = 35000;
}

class Emp extends Single{
	int empbonus = 10000;
	
}
class Total{
	public static void main(String[] args){
		Emp obj= new Emp();
		System.out.println("Salary after bonus: "+(obj.empsalary+obj.empbonus));
	}
}