class Trow1{
	public static void main(String[] args){
		int age=16;
		if (age<18){
			throw new InvalidAgeException("You can not Eligible for vote");
		}
		else{
			System.out.println("You are not eligible");
		}
	}
}