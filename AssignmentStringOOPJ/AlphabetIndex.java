
public class AlphabetIndex{
	    public static void main(String[] args) {
	        String str = "The quick brown fox jumps over the lazy dog.";

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.print(ch + " ");
	        }
	        System.out.println("\n=================================");

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            int index = str.indexOf(ch);
	            System.out.print(index + " ");
	        }
	        System.out.println("\n\nSample string of all alphabet: \"" + str + "\"");
	    }
	}