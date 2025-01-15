import java.util.Scanner;

class Student
{
	public static void main(String [] args)
	{
		String name;
		float percentage;
		long number;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the Student Name: ");
		name = obj.nextLine();
		
		System.out.print("Enter the Percentage: ");
		percentage = obj.nextFloat();
		
		System.out.print("Enter the Mobile Number: ");
		number = obj.nextLong();
		
		System.out.println("Name is: "+name);
		System.out.println("Percentage is: "+percentage);
		System.out.println("Mobile Number is: "+number);
	}
}