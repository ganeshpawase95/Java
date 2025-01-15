
public class SingleTaskMultipleThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        SingleTaskMultipleThread obj1 = new SingleTaskMultipleThread();
        SingleTaskMultipleThread obj2 = new SingleTaskMultipleThread();
        obj1.start();
        obj2.start();
    }
    
}
