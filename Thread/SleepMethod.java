

class SleepMethod{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + (i));
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}