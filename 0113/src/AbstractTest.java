abstract class Shape{
	String color;
	Shape(String color){
		this.color = color;
	}
	abstract void draw();
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}

class Circle extends Shape{
	int x, y, r;
	Circle(String color, int x, int y, int r){
		super(color);
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	void draw() {
		System.out.println("Circle: "+getColor() +" "+x +" "+y+" "+r);
	}
	
	
}

class Rectangle extends Shape{
	int x, y, r;
	Rectangle(String color, int x, int y){
		super(color);
		this.x = x;
		this.y = y;
	}
	
	@Override
	void draw() {
		System.out.println("Rectangle: "+getColor() +" "+x +" "+y);
	}
	
	
}

public class AbstractTest {
	static Shape[] ss = new Shape[5];
	static int count =0;
	
	public void allShapeDraw() {		
		for(int i=0; i<count; i++) {
			ss[i].draw();
		}
	}
	public static void main(String[] args) {		
		ss[count++] = new Circle("red", 10, 10, 20);
		ss[count++] = new Rectangle("blue", 10, 20);
 	}
}
