package Thread;

import java.lang.Thread;

class Test extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.start();
    }
}
