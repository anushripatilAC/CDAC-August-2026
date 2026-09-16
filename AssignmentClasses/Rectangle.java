
public class Rectangle {
	double length,breadth;
	
	
	Rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	 public double Area() {
		 return length  * breadth;
	 }	
}
	 
class rect{
	public static void main(String [] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		System.out.println("The Area of First Rectangle:"  +  r1.Area());
		System.out.println("The Area Of Second Rectangle: "  + r2.Area());
	}
		 
}	
	


