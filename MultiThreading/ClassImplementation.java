
class Mythread extends Thread{
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("Child Thread..."+i);
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ClassImplementation {
	
	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread();
		t1.start();
		
		System.out.println("Priority of thread t1: "+t1.getPriority());
		System.out.println("Priority of current thread : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(5);
		System.out.println("Priority of current thread : "+Thread.currentThread().getPriority());
		
		System.out.println("Name of current thread : "+Thread.currentThread().getName());
		System.out.println("State of current thread : "+Thread.currentThread().getState());
		System.out.println("Current thread is alive : "+Thread.currentThread().isAlive());
		System.out.println("Current thread Id is : "+Thread.currentThread().getId());
		
		
		t1.join();
		
		for(int i = 0 ; i<5 ; i++) {
			Thread.sleep(100);
			System.out.println("main Thread..."+i);
		}
		System.out.println("Current thread is alive : "+Thread.currentThread().isAlive());
	}
	
}
