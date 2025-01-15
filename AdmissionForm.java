class AdmissionForm
{
	void get(){
		System.out.println("Ganesh get the admission form");
	}
	void fill(){
		System.out.println("After getting that form he fill that form.");
	}
	void submit(){
		System.out.println("Then Submit that form in office.");
	}
	void conform(){
		System.out.println("The Admin has conform admission.");
	}
	public static void main(String[] args){
		AdmissionForm ganesh= new AdmissionForm();
		ganesh.get();
		ganesh.fill();
		ganesh.submit();
		
		AdmissionForm admin=new AdmissionForm();
		admin.conform();
	}
}