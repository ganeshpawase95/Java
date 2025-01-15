class JavaLecture
{
	void teach(){
		System.out.println("Raghu sir teach Java");
	}
	void learn(){
		System.out.println("Ganesh learn the Java");
	}
	public static void main(String [] args)
	{
		JavaLecture raghu = new JavaLecture();
		raghu.teach();
		
		JavaLecture ganesh=new JavaLecture();
		ganesh.learn();
	}
}