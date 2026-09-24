package operation.com;
import java.util.TreeSet;


public class AddElementIntoAnother {
	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<>();     //createTreeset
		set1.add("pink");
		set1.add("blue");
		set1.add("orange");
		set1.add("green");
		set1.add("purple");
		
		System.out.println(set1);
		
		TreeSet<String> set2 = new TreeSet<>();      //create second TreeSet
		set2.add("black");
		set2.add("white");
		set2.add("red");
		
		System.out.println(set2);
		
		set2.addAll(set1);
		
		System.out.println(set2);
		
		
	
		
		
		
		
		
	}

}
