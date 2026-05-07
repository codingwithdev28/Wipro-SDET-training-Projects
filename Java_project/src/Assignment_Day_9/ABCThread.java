package Assignment_Day_9;



public class ABCThread {
	static volatile int n=0;
	static int r=5;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> {
			for(int i=0;i<r;) {
				if(n==0) {
					System.out.print("A");
					n=1;
					i++;
				}
			}
				
        });
		Thread t2 = new Thread(() -> {
			for(int i=0;i<r;) {
				if(n==1) {
					System.out.print("B");
					n=2;
					i++;
				}
			}
				
        });
		Thread t3 = new Thread(() -> {
			for(int i=0;i<r;) {
				if(n==2) {
					System.out.print("C");
					n=0;
					i++;
				}
			}
				
        });
		
		t1.start();
		t2.start();
		t3.start();
		}

	}


