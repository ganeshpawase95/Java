import java.lang.Thread;
class Single extends Thread{
    public void run(){
        System.out.println("Single Thread");
    }
    public static void main(String[] args){
        Single obj = new Single();
        obj.start();
    }
}