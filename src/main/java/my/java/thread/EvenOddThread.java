package my.java.thread;

public class EvenOddThread {

	public static void main(String[] args) {
		EvenOdd evenOdd=new EvenOdd();
//	   // Thread evenThread=new Thread(new Even(evenOdd));
//	   // Thread oddThread=new Thread(new Odd(evenOdd));
//	    Even evenThread=new Even(evenOdd);
//	    Odd oddThread=new Odd(evenOdd);
//	    
//	    evenThread.start();
//	    oddThread.start();
	    

	    
		
Thread evenThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					evenOdd.getEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
Thread oddThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					evenOdd.getOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
	evenThread.start();
	oddThread.start();
	    		
	}
}


class Even extends Thread{
	EvenOdd e;
	public Even(EvenOdd e) {
		this.e=e;
	}
	@Override
	public void run() {
		try {
			e.getEven();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


class Odd extends Thread{

	EvenOdd e;
	public Odd(EvenOdd e) {
		this.e=e;
	}
	@Override
	public void run() {
		EvenOdd oe=new EvenOdd();
		try {
			oe.getOdd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class EvenOdd{
	
	private  static int val=1;
	
	public synchronized void getEven() throws InterruptedException {
		while(true) {
			
				if(val%2!=0) {
					wait();
				} 
			System.out.println("Even-"+val);
			val++;
			notify();
			Thread.sleep(2000);
		
		}
	}
	public synchronized void getOdd() throws InterruptedException {
		while(true) {
			
		if(val%2==0) {
			wait();
		} 
			System.out.println("Odd-"+val);
			val++;
			notify();
		Thread.sleep(2000);
		}
	}
}