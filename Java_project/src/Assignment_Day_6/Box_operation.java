package Assignment_Day_6;

class Box{
	int length;
	
	Box(int length){
		this.length=length;
	}
	
}
public class Box_operation {
	
	static void modify(Box b) {
		b.length=300;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(100);
		System.out.println("Before length modification: "+box.length);
		
		modify(box);
		
		System.out.println("After length modification: "+box.length);
		

	}

}
