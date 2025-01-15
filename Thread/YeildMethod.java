import java.lang.Thread;

class YeildMethod extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args)throws InterruptedException{
		YeildMethod t=new YeildMethod();
		t.start();
		
		for(int j=1;j<=5;j++){
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+j);
		}
	}
}