package Assignment_Day_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService s= Executors.newFixedThreadPool(3);
		
		for(int i=145;i<=155;i++) {
			int orderId= i;
			s.execute(()->{
				System.out.println("Order ID: "+orderId+" delivered by "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				System.out.println("Order "+orderId+" completed.");
			});
		}
		s.shutdown();

	}

}
