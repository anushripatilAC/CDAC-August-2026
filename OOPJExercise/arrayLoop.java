import java.util.Scanner;

public class arrayLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int[] arr = new int[n];  // store input  array 
		int sum = 0;
		for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
		
		}
		System.out.println("sum of array is:" + sum);
		
		
	

	}

}
