package operation.com;
import java.util.TreeSet;


public class ReverseTreeSet {
	public static void main(String[] args) {
		TreeSet <String> set = new TreeSet<>();
		set.add("pink");
		set.add("red");
		set.add("orange");
		set.add("black");
		
		System.out.println("Original set:" + set);
		
		TreeSet <String> reverseSet = (TreeSet<String>)set.descendingSet();
		
		System.out.println("Reverse Order set:" + reverseSet);
		
		
		
		
	}
	

}
