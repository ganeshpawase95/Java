class EvenChar{
	public static void main(String[] args){
		String str="Ganesh";
		for (int i=0;i<str.length();i+=2){
			System.out.println("Even characters in the string is: "+ str.charAt(i));
		}
	}
}