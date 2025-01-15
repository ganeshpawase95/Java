import java.lang.Thread;


class SleepMethod1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+(i));
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)throws InterruptedException{
		SleepMethod1 t = new SleepMethod1();
		t.start();
		
		for(int j=1; j<=5; j++){
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+(j));
			
			
		}
	}
}