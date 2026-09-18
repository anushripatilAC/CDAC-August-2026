import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		
		
		int[] search = new int[n];
		for (int i = 0; i <n;i++) {
			search[i] = sc.nextInt();
				if(search[i] == n) {					
					System.out.println("found in:"  + n);
					break;
				}
				else{ 
						System.out.println("Not found");
				}
			}
		}
}

		
		
				




