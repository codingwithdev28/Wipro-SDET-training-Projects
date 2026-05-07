package Assignment_Day_4;

interface Movable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable{
	int x, y;
	int xspeed,yspeed;
	
	MovablePoint(int x, int y, int xspeed, int yspeed){
		this.x=x;
		this.y=y;
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}
	public void moveUp() {
		y+=yspeed;
	}
	public void moveDown() {
		y-=yspeed;
	}
	public void moveLeft() {
		x+=xspeed;
	}
	public void moveRight() {
		x-=xspeed;
	}
	public String toString() {
		return (("("+x+","+y+")"));
	}
}



public class Moveble_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint p= new MovablePoint(0, 0, 2, 4);
		System.out.println("Points are at "+p);
		p.moveRight();
		p.moveDown();
		System.out.println("Poitns moved at "+p);

	}

}
