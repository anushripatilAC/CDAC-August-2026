public  class Q3Rectangle {
	 int length;
	 int breadth;
	 Q3Rectangle(int l,int b){
		 length = l;
		 breadth = b;
	 }
	 void area() {
		 System.out.println("Rectangle Area:" + (length*breadth));
	 }
	 void perimeter() {
		 System.out.println("Rectangle Perimeter:"  + (2*(length+breadth)));
		 }
 }
class Square extends Q3Rectangle{
	Square(int side){
		super(side,side);
	}
	//method overriding
	@Override
	void area() {
		 System.out.println("Square Area:" + (length*breadth));
	 }
	@Override
	 void perimeter() {
		 System.out.println("Square   Perimeter:"  + (2*(length+breadth)));
		 }
	
}
 class Main {
	public static void main(String [] args) {
		Q3Rectangle r = new Q3Rectangle(10,5);
		
		System.out.println("Rectangle");
		r.area();
		r.perimeter();
		
		Square s = new Square(5);
		System.out.println("Square");
		
		s.area();
		s.perimeter();
	}
}


