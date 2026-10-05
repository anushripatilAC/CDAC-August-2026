import java.util.Scanner;
public class ImplementQueueUsingArray{
	static int[] arr; //Create Queue using array
	
	
	static int front=0;
	static int rear = -1;
	
	//++++++++++======Adding Element++++++++++========
	
	static void enqueue(int value) {
		if(rear == arr.length -1) {
			System.out.println("Queue is full");
			
		}
		rear++;
		arr[rear] = value;
	}
	
	//===============DEQUEUE++++++++++++++
	
	  static void  dequeue() {          
		 if(front > rear) {
			 System.out.println("Queue is Empty");
			 
		 }
		 System.out.println( arr[front]);
		 front++;
		 
		
	}
	//++++++++++++SEARCH++++++++++++++
	static  void search(int value) {        
		 if(front > rear)
		 {
			 System.out.println("Queue is empty");
			 return;
		 }
		 
		 boolean found = false;
		 
		 for(int i = front;i <=rear;i++) {
			 
				 	if(arr[i] == value ) {
				 		System.out.println(value+ "  " + "Element is  found ");
				 		found = true;
				 		break;
				 	}
				 	
			 }
		 }
	// ++++++++++++++++DISPLAY+++++++++++
	 static
	  void display() {
		  if(front > rear) {
			  System.out.println("queue is Empty");
		  }
			  else {
				  for(int i = front; i <= rear; i++) {
					  System.out.print(arr[i] + " ");
				  }
				  System.out.println(" ");
			  }
	 }
	//++++++++++++++++++++++++
	//main Start
	//++++++++++++++++++++++++++++
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Size");
	int n = sc.nextInt();
	
	arr = new int [n];  //array
	
	System.out.println("Enter Element");
	for (int i = 0;i < n;i++) {
		int value =  sc.nextInt();   //this loop for user input
		enqueue(value);
		
		
	
	}
	
	display();
	System.out.println("Search element");
	search(40);
	dequeue();
	System.out.println("remove first element ");
	
	
	}

}
