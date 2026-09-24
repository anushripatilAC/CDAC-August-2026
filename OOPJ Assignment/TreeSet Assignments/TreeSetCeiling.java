import java.util.TreeSet;
public class TreeSetCeiling {
	public static void main(String[] args) {
		TreeSet<Integer> Number = new TreeSet<>();
		 
		Number.add(25);
		Number.add(40);
		Number.add(89);
		Number.add(90);
		Number.add(68);
		Number.add(70);
		Number.add(30);
		
		System.out.println("Ceiling For 24:"  + Number.ceiling(24));    //if element present in set print equal element if not so output  Greater element
		System.out.println("Ceiling For 65:"  + Number.ceiling(65));
		System.out.println("Ceiling for 29:"  + Number.ceiling(29));
		
	}

}
