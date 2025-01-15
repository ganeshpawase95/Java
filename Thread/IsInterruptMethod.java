import java.lang.Thread;



class IsInterruptMethod extends Thread{
	public void run(){
		
			System.out.println(Thread.isInterrupted());
		
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
		InterruptMethod ie=new InterruptMethod();
			ie.start();
			ie.interrupt();
	}
}