//Encapsulation = Encapsulation is the mechanism of wrapping the data(means variable) and code acting on the data(means methods)together(binding) as a single unit called encapsulation.

class Employee{
	private int emp_id;
	public void setEmp_id(int emp_id1){
		emp_id=emp_id1;
	}
	public int getEmp_id(){
		return emp_id;
	}
}
class Company1{
	public static void main(String[] args){
		Employee e=new Employee();
		e.setEmp_id(101);
		System.out.println(e.getEmp_id());
	}
}