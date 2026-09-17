import java.util.Scanner;
public class Complex {
	double real;
	double image;
	
	
	public Complex(double r,double i) {
		real = r;
		image =i;
		
	}
	public Complex Add(Complex c2) {
		return new Complex(real + c2.real,image + c2.image);
	}
	public Complex Sub(Complex c2) {
		return new Complex(real -  c2.real ,image - c2.image);
	}
	public Complex Pro(Complex c2) {
		double realPart = (real * c2.real);
		double imagePart = (image * c2.image);
		
		return new Complex(realPart,imagePart);
	}
	
	public void print() {
		if(image > 0) {
			System.out.println(real  + "+" + image + "i");
		}else { 
			System.out.println(real + "-" + Math.abs(image)+"i");
		}
	}
}
class Com{
	
	public static void main(String [] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter real and imagenary Part");
		double r1 = sc.nextDouble();
		double i1 = sc.nextDouble();
		
		Complex c1 = new Complex(r1,i1);
		
		System.out.println("Enter real and imagenary Part");
		double s1 = sc.nextDouble();
		double t1 = sc.nextDouble();
		
		Complex c2 = new Complex(s1,t1);
		
		Complex sum = c1.Add(c2);
		Complex subtract = c1.Sub(c2);
		Complex Product = c1.Pro(c2);
		
		System.out.println("sum:");
		sum.print();
		System.out.println("Subtract:");
		subtract.print(); 
		System.out.println("Product:");
		Product.print();
				
			}
		}
		
		
		
		
	
	


