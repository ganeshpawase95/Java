import java.io.*;

class CheckedException{
	public static void main(String [] args){
		try{
			FileReader f=new FileReader("demo.txt");
		}
		catch(IOException e){
			System.out.println("Exception occur: "+ e.getMessage());
		}
	}
}