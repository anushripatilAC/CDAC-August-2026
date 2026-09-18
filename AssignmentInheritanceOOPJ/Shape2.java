 class ShapeBase {
	void shapeDisplay() {
		System.out.println("This Is Shape");
	}
 }
class Rect extends ShapeBase{
	void rectangleDisplay() {
		System.out.println("This is REctangle");
	}
}
class circuler extends ShapeBase{
	void circleDi() {
		System.out.println("This is shape");
	}
}
class Square2 extends Rect	{
	 void display() {
		System.out.println("This is Square");
	 }
}
public class Shape2 {
	public static void main(String [] args) {
		
	 Square2 s = new Square2();
	 s.shapeDisplay();
	 s.rectangleDisplay();
	 s.display();
	}
}
