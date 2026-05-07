package Assignment_Day_4;

interface Polygon{
	double getArea();
	default double getPerimeter(int... sides) {
		int sum =0;
		for(int s:sides) {
			sum+=s;
		}
		return sum;
	}
	static String shapeInfo() {
		return "Polygon: closed shape with multiple sides";  
	}

}

class Rectangle implements Polygon{
	int l,b;
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
		
	}
	public double getArea() {
		return l*b;
	}
}

class triangle implements Polygon{
	int h,b;
	triangle(int b, int h){
		this.b=b;
		this.h=h;
		
	}
	public double getArea() {
		return 0.5*b*h;
	}
}
public class Polygon_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(34,28);
		System.out.println("Area of Rectangle: "+r.getArea());
		System.out.println("perimeter of Rectangle: "+r.getPerimeter(12,16,12,16));
		
		triangle t=new triangle(36,24);
		System.out.println("\n\nArea of Triangle: "+t.getArea());
		System.out.println("perimeter of Triangle: "+t.getPerimeter(12,16,18));
		
		System.out.println("\n"+Polygon.shapeInfo());
	}

}
