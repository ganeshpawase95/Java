import java.lang.Thread;


class Priority extends Thread{
	public void run(){
		System.out.println("The priority of current thread is: "+ Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		//System.out.println(Thread.currentThread.getPriority());
		Priority t=new Priority();
		t.start();
		t.setPriority(MAX_PRIORITY);
	}
}