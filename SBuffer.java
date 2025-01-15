import java.lang.StringBuffer;

public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Nebula");
		StringBuffer sb1= new StringBuffer("Ganesh");
        System.out.println("Capacity: " + sb.capacity());
		System.out.println("Append: "+ sb.append("Tech"));
		System.out.println("Reverse: "+ sb1.reverse());
		System.out.println("Character At: "+  sb.charAt(3));
		System.out.println("Delete: "+ sb.delete(2,5));
		System.out.println("Delete the char: "+ sb.deleteCharAt(5));
		System.out.println("Index of: "+  sb.indexOf("e"));
		System.out.println("Last index of: "+ sb.lastIndexOf("e"));
		System.out.println("SubString is:"+ sb.substring(2,6));
		System.out.println("Sub Sequence is: "+ sb.subSequence());
		System.out.println("Equals "+ sb.equals(sb1));
		System.out.println(""+ sb.toString());
		System.out.println("Set a character At: "+ sb.setCharAt(4,"r"));
    }
}
