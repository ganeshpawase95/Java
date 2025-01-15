import java.lang.Thread;

class MyThread extends Thread{
	public static void main(String[] args){
		Thread t=new Thread();
		t.start();
		System.out.println(t.getState());
	}
}