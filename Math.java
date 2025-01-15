import java.util.Scanner;


class Math
{
	public static void main(String [] args)
	{
		double num1;
		double num2;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Number 1: ");
		num1=obj.nextDouble();
		
		System.out.print("Enter Number 2: ");
		num2=obj.nextDouble();
		
		double addition = num1+num2;
		double substraction= num1-num2;
		double multiplication= num1*num2;
		double division= num1/num2;
		
		System.out.println("Addition is: "+ addition);
		System.out.println("Substraction is: "+ substraction);
		System.out.println("Multiplication is: "+ multiplication);
		System.out.println("Division is:"+ division);
	}
}