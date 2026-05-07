package Assignment_Day_9;
class acc{
	private int bal=10000;
	
	public synchronized void deposit(int x) {
		bal+=x;
		System.out.println(Thread.currentThread().getName()+" deposited: "+x+"  Current Balance: "+bal);
	}
	public synchronized void withdraw(int y) {
		if(y<=bal) {
			bal-=y;
		System.out.println(Thread.currentThread().getName()+" Withdrawal Successful  Current Balance: "+bal);
		}
		else
			System.out.println(Thread.currentThread().getName()+" Withdrawal balance exceeds current balance limit");
			
	}
}

public class Bank_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  acc a= new acc();
		  
		  Thread t1=new Thread(()->{
			  a.deposit(30000);
			  
		  });
		  Thread t2=new Thread(()->{
			  a.deposit(17000);
			  a.withdraw(5000);
			  
		  });
		  Thread t3=new Thread(()->{
			  a.deposit(75000);
			  
		  });
		  t1.start();
		  t2.start();
		  t3.start();

	}

}
