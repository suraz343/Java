class Utility{
	int i;
	boolean bool = false;
	
	public synchronized void set(int i) throws InterruptedException{
		while(bool) {
			wait();
		}
		this.i = i;
		bool = true;
		System.out.println("Producer " +i);
		notify();
	}
	
	public synchronized void get() throws InterruptedException {
		while(!bool) {
			wait();
		}
		bool = false;
		System.out.println("Consumer " +i);
		notify();
	}
		
}



class Producer implements Runnable{
	private Utility utility;
	public Producer(Utility utility) {
		this.utility = utility;
		Thread Producer = new Thread(this,"Producer");
		Producer.start();
			
		}
	public void run () {
		int i =0;
	
		while(true) {
			try {
			utility.set(i++);
			Thread.sleep(1000);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
class Consumer implements Runnable{
	private Utility utility;
	public Consumer(Utility utility) {
		this.utility = utility;
		Thread consumer = new Thread(this,"Consumer");
		consumer.start();
			
		}
	public void run () {
		while(true) {
			try {
			utility.get();
			Thread.sleep(1000);}
			catch(Exception e) {
				
			}
			
		}
	}
}


class ProducerConsumer {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		new Producer(utility);
		new Consumer(utility);
	}
}



