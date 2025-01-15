package Thread;

public class RunableInterface implements Runnable {
    public void run() {
        System.out.println("Thread is running as Runnable Interface");
    }
    public static void main(String[] args) {
        RunableInterface obj = new RunableInterface();
        Thread t = new Thread(obj);
        t.start();
    }
    
}
