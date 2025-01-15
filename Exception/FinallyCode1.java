class FinallyCode1{
	public static void main(String[] args){
		try{
			int a=10, b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		finally{
			System.out.println("Always executed");
		}
	}
}