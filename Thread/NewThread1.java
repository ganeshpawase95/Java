import java.lang.Thread;

class NewThread1 extends Thread{
	public void run(){
		System.out.println("hii");
	}
	public static void main(String [] args){
		NewThread1 t=new NewThread1();
		t.start();
		System.out.println("Hello");
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t.isAlive());
	}
}