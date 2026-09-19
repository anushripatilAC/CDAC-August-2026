import java.util.ArrayList;

public class Operationlist {
		public static void main(String[] args) {
			ArrayList<String> color= new ArrayList<>(); 
			color.add("Pink");
			color.add("Brown");
			color.add("Sky");
			color.add("red");
			color.add("green");
			
			
			System.out.println("adding color:" + color);
			
			
			color.add(0,"blue");
			System.out.println("after inserting colour add first position:" + color);
			
			
			color.set(4,"Orange");
			System.out.println("After update Specific Element:" + color);
			
			
			color.remove(3);
			System.out.println("Remove 3rd element:" + color);
			
			
		
			
			
		}
}
