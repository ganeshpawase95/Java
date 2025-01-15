class StringChar{
	public static void main(String[] args){
		String str="Ganesh";
		String first=Character.toString(str.charAt(0));
		String last=Character.toString(str.charAt(str.length()-1));
		
		System.out.println("First character is: "+ first);
		System.out.println("Last character is: "+ last);
	
		
	}
}