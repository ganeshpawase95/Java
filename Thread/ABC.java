public class ABC extends Thread{ 
    public void run() {
        System.out.println("Thread is running");
    }
}

    class Test1 extends Thread{ 
        public void run() {
            System.out.println("Thread 2 is running");
        }
    }
    
    class MultipleTaskMultipleThread{
        public static void main(String[] args) {
            ABC obj1 = new ABC();
            obj1.start();
            Test1 obj2 = new Test1();
            obj2.start();

    
}  
  
}


