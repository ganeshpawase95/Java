class Interview
{
	void question(){
		System.out.println("Interviewer = Introduce your self?");
	}
	void question1(){
		System.out.println("Interviewer = What is a Java?");
	}
	void question2(){
		System.out.println("Interviewer = What is Operator?");
	}
	void question3(){
		System.out.println("Interviewer = What are the features of Java?");
	}
	void question4(){
		System.out.println("Interviewer = What are the access modifiers in Java?");
	}
	void question5(){
		System.out.println("Interviewer = What is Garbage Collection in Java?");
	}
	void answer(){
		System.out.println("Ans => My self Ganesh Pawase. I just complete my Bachelor of Technology in Information Technology from BVDUET, Navi Mumbai. I got 9.93CGPA in final year.");
	}
	void answer1(){
		System.out.println("Ans => Java is a Partial object oriented programming Language. Java is powerfull programming language, which is used in backend development in web development.");
	}
	void answer2(){
		System.out.println("Ans => Operator is a one type of Symbol wich operand one or more values.");
	}
	void answer3(){
		System.out.println("Ans => Java is Object oriented, platform independent, robust, secure and multi-threading programming language.");
	}
	void answer4(){
		System.out.println("Ans => Private, Default, Protected,and Public.");
	}
	void answer5(){
		System.out.println("Ans => Garbage Collection is the process of automatically reclaiming unused memory. The JVM removes objects that are no longer referenced.");
		System.out.println("We will write that- System.gc().");
	}
	public static void main(String[] args){
		Interview sir=new Interview();
		
		
		Interview ganesh=new Interview();
		
		sir.question();
		ganesh.answer();
		
		sir.question1();
		ganesh.answer1();
		
		sir.question2();
		ganesh.answer2();
		
		sir.question3();
		ganesh.answer3();
		
		sir.question4();
		ganesh.answer4();
		
		sir.question5();
		ganesh.answer5();
	}
}