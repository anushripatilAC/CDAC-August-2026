
 public class Triangle {
	 double a,b,c;
	 
	 Triangle(double a,double b,double c){
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	  public double getPerimeter() {
	  	return a + b + c;
	  }
	   public double getArea() {
		   double s = getPerimeter()/2;
		   return Math.sqrt(s*(s -a)*(s - b)* (s - c));
	   }
 }
	   
 class tr{
	public static void main(String [] args) {
		Triangle t1 =  new Triangle(3,4,5);
		
		    System.out.println("The Perimeter is:" + t1.getPerimeter());
		    System.out.println("the Area of Peerimeter:" + t1.getArea());
		 
	 }
 }
 

