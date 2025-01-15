import java.lang.Thread;


class DaemonThread1 extends Thread{
	public void run(){
		System.out.println("This is deamon thread prgram");
		System.out.println("Check if its DaemonThread: "+ Thread.currentThread().isDaemon());
	}
	public static void main(String[] args){
		DaemonThread1 t=new DaemonThread1();
		t.setDaemon(true);
		t.start();
	}
}