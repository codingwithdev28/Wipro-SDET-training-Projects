package Multithreading;

public class Thread_3 implements Runnable{
	public void run()
	{
		for (int i = 1; i <= 3; i++) {
          System.out.println(Thread.currentThread().getName());
          //Thread.yield();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_3  t0= new Thread_3();
		t0.run();
		Thread_3  t1= new Thread_3();
		t1.run();
		System.out.println(t0.equals(t1));
		

	}

}
