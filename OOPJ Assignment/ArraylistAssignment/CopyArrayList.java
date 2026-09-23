package operation.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CopyArrayList{
	public static void main(String[] args) {
		List<String>  sourceList = new ArrayList<>();		//sourceList create
		sourceList.add("Red");
		sourceList.add("Blue");
		sourceList.add("Pink");
		
		System.out.println("the OriginalList:"  + sourceList);
		
		List<String>  destinationList = new ArrayList<>(sourceList);   //create destinationList
		
		
		
		Collections.copy(destinationList,sourceList);
		
		System.out.println("the CopyList: " + destinationList);
		
	

}
}