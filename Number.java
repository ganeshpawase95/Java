import java.util.Scanner;


class Number
{
	public static void main(String [] args)
	{
		int num;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num=obj.nextInt();
		
		if (num%2==0){
			System.out.print("Number is Even");
		}
		else{
			System.out.print("Number is Odd");
		}
		
	}
}