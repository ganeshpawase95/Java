public class MultipleTaskMultipleThread extends Thread{ 
    public void run() {
        System.out.println("Thread is running");
    }

    class Test1 extends Thread{ 
        public void run() {
            System.out.println("Thread 2 is running");
        }
    
    class Threading{
        public static void main(String[] args) {
            MultipleTaskMultipleThread obj1 = new MultipleTaskMultipleThread();
            obj1.start();
            Test1 obj2 = new Test1();
            obj2.start();
        }

    }
}  
  
}


