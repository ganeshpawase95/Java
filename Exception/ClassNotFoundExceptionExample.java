import java.lang.ClassNotFoundException;

class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurs: " + e.getMessage());
        }
    }
}
