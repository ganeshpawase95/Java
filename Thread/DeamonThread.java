import java.lang.Thread;

class DaemonThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("This is child thread");
	}
	public static void main(String[] args){
		DaemonThread dt=new DaemonThread();
		
		dt.setDaemon(true);
		dt.start();
	}
} 