import java.util.Scanner;
public class BubbleSort {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter Size");   // for input size
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for(int i = 0; i< n; i++) {     //input element
				arr[i]= sc.nextInt();
				
			}
			
			
			for(int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n- 1 - i; j++) {
					if (arr[j] > arr[j+1]) {				//first element is large than second swap 
						int temp = arr[j];
						arr[j] = arr[j+1];				
						arr[j+1] = temp;
					}
					
				}
			}
			
			for(int i = 0 ; i< n; i++) {
				System.out.print(arr[i] + " ");
			}
			;
		}
}
