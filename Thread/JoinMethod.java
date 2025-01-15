import java.lang.Thread;



class JoinMethod extends Thread{
	public void run(){
		for (int i=1;i<=5;i++){
			try{
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
	}
	public static void main(String[] args)throws InterruptedException{
		JoinMethod t=new JoinMethod();
		t.start();
		t.join();
		
		for(int j=1;j<=5;j++){
			try{
				
				System.out.println(Thread.currentThread().getName()+":"+j);
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}