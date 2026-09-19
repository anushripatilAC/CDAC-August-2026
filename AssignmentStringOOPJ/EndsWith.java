
public class EndsWith {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String endStr = "se";

        boolean result1 = str1.endsWith(endStr);
        boolean result2 = str2.endsWith(endStr);

        System.out.println("\"" + str1 + "\" ends with \"" + endStr + "\"? " + result1);
        System.out.println("\"" + str2 + "\" ends with \"" + endStr + "\"? " + result2);
    }
}