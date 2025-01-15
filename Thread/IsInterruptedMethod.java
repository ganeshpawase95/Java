import java.lang.Thread;



class IsInterruptedMethod extends Thread{
	public void run(){
		
			System.out.println(Thread.currentThread().isInterrupted());
		
			try{
				for(int i=1;i<=5;i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
		catch(InterruptedException e){
				System.out.println(e);
			}
	}
	public static void main(String[] args){
		IsInterruptedMethod ie=new IsInterruptedMethod();
			ie.start();
			ie.interrupt();
	}
}