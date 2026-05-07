package Multithreading;

public class MyThreads extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreads t0= new MyThreads();
		t0.start();
		
		t0.sleep(6000);
		t0.join();
		MyThreads t1= new MyThreads();
		t1.start();
		//t1.sleep(3000);
		t1.join();
		
		System.out.println("Current Priority for t1= "+t1.getPriority());
		//t1.setPriority(MAX_PRIORITY);
		//System.out.println("Current Priority for t1= "+t1.getPriority());
		MyThreads t2= new MyThreads();
		t2.start();
		System.out.println("t2 name: "+t2.getName());
		t2.setName("max");
		System.out.println("t2 name: "+t2.getName());
		

	}

}
