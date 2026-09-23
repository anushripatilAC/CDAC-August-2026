package operation.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ShuffleNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		
		System.out.println("Original:" + list);
		
		
		Collections.shuffle(list);
		 System.out.println("after Shuffle:"  + list);
		
		
	}
}
