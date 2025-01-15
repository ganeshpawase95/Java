import java.lang.Thread;

class DaemonThread extends Thread{
	public void run(){
		//System.out.println(dt.currentThread.isDaemon());
		System.out.println("This is child thread");
	}
	public static void main(String[] args){
		DaemonThread dt=new DaemonThread();
		
		dt.setDaemon(true);
		System.out.println("Is dt a daemon thread? " + dt.isDaemon());
        dt.start();

        //System.out.println("Is dt a daemon thread? " + dt.isDaemon());
		
	}
} 