class Operator
{   
    static int a = 40;
    static int b = 20;
    static int c = a + b;
    static int d = a - b;
    static int e = a * b;
    static int f = a / b;
    static int g = a % b;

    
    public static void main(String args[])	
    {
        System.out.println("..............................Assignment operators......................................");
        int x = 10;
        x += 5;
        x -= 5;
        x *= 5;
        x /= 5;
        x %= 5;
        System.out.println("Add and Assign ="+ x);
        System.out.println("Sub and Assign ="+ x);
        System.out.println("Mul and Assign ="+ x);
        System.out.println("Div and Assign ="+ x);
        System.out.println("Rem and Assign ="+ x);

        
    
        System.out.println(".........................Arithmetic operators............................");
        System.out.println("Addition = " + c);
        System.out.println("Subtraction = " + d);
        System.out.println("Multiplication = " + e);
        System.out.println("Division = " + f);
        System.out.println("Reminder = " + g);
    }
}