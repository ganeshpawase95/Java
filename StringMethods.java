class StringMethods{
	public static void main(String[] args){
		String str1="Nebulla";
		String str2="Technology";
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.concat(" "+str2));
		System.out.println(str1.length());
		
		String str3="  Ganesh  ";
		System.out.println(str3.trim());
		System.out.println(str3.isEmpty());
		System.out.println(str3.charAt(3));
		System.out.println(str2.indexOf("T"));
		System.out.println(str1.equals(str3));
		System.out.println(str3.replace('G','M'));
	}
}