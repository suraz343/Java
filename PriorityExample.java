
public class PriorityExample extends Thread {
	public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Priority is "+Thread.currentThread().getPriority());
    }
}
