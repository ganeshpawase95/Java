public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to load a non-existent class
            Class.forName("XYZ");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurs: " + e.getMessage());
        }
    }
}
