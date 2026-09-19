
public class Reverse {
	    public static void main(String[] args) {
	        String str = "The Quick Brown Fox!";
	        
	        StringBuilder sb = new StringBuilder(str);
	        String reversedStr = sb.reverse().toString();

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reversedStr);
	    }
	}


