package my.java.thread;

/*
 * Printing a-z using two threads.
 * 
 */

public class AlphabetThread {
   private static final String str="abcdefghijklmnopqrstuvwxyz";
   
   public static void main(String args[]){
	   EvenOddAlphabet oe=new EvenOddAlphabet(str);
	   Thread evenThread=new Thread(new Runnable(){

		@Override
		public void run() {
			try {
				oe.printEven();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}catch(StringIndexOutOfBoundsException e){
				e.printStackTrace();
			}
		}
		   
	   });
	   
	   Thread oddThread=new Thread(new Runnable(){

		@Override
		public void run() {
           try {
			oe.printOdd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}			
		}
		   
	   });
	   
	   evenThread.start();
	   oddThread.start();
	   
   }
	
	
}


class EvenOddAlphabet{
	private static int i=0;
	private String str;
	public EvenOddAlphabet(String str){
		this.str=str;
	}
	
	public synchronized void printEven() throws InterruptedException{
		try{
		while(true){
			while(i%2!=0){
				wait();
			}
			System.out.println("Thread1:"+str.charAt(i));
			i++;
			notify();
			Thread.sleep(2000);
		}}catch(StringIndexOutOfBoundsException e){
			System.out.print("Exit");	
			System.exit(0);
			}
	}
	public synchronized void printOdd() throws InterruptedException{
		try{
		while(true){
			while(i%2==0){
				wait();
			}
			System.out.println("Thread2:"+str.charAt(i));
			i++;
			notify();
			Thread.sleep(2000);
		}
	}catch(StringIndexOutOfBoundsException e){
		System.out.print("Exit");
		System.exit(0);
	}
	}
}
