import java.util.*;
 class Recursion {
	 
	 
	 
	static int Sum(int arr[] ,int i) {
		if( i == arr.length) {
			return 0;
		}
		return arr[i]+Sum(arr,i+1); 
	}
 	//++++========CREATE AVERAGE+====
	
	static double Average(int arr[]) {
		return (double)(Sum(arr,0))/ arr.length;
	}
		
	
	//==========FIND MAX SCORE =======
	
	static int TopScore(int[]arr,int i) {
		if(i== arr.length-1) {
			return arr[i];
		
		}
		return Math.max(arr[i], TopScore(arr,i+1));
		
	}
	
	//++++++++++=Lower  score+==========

	static int MinScore(int[] arr,int i) {
		if( i == arr.length-1) {
			return arr[i];
		}
		return Math.min(arr[i],MinScore(arr,i+1));
	}
public static void main(String[] args) {
				int[] score = {70,85,60,95,80};
				System.out.println("Sum is" + Sum(score,0)); 
				System.out.println("Average is:" + Average(score));
				System.out.println("TOpScore:"  + TopScore(score,0));
				
				}
}

	



