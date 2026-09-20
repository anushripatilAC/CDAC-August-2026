import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class SortArrayList {
		public static void main(String [] args) {
			List <Integer> list = Arrays.asList(40,98,78,33,21,66);
			Collections.sort(list);
			System.out.println(list);
		}
}

