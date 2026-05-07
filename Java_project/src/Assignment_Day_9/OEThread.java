package Assignment_Day_9;

public class OEThread extends Thread {
	static int n=1;
	static int l=100;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    
		Thread t1 = new Thread(() -> {
			while(n<=l) {
				if(n%2==0) {
					System.out.println(n);
					n++;
				}
				else {
					Thread.yield();
				}
				
			}
        });
      
        Thread t2 = new Thread(() -> {
			while(n<=l) {
				if(n%2!=0) {
					System.out.println(n);
					n++;
				}
				else {
					Thread.yield();
				}
				
			}
        });
		t1.start();
		t2.start();

	}

}
