
public class InsertAt {
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
		}
	}
	
	public static class Linkedlist{
		Node head = null;
		Node tail = null;
		
		//insertDAta
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
			}
			else {
				tail.next = temp;
		}
			tail = temp;
			}
		
		
		//Display
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " " );
				temp = temp.next;
			}
		}
		}

	
	
	
public static  void main(String [] args) {
	Linkedlist ll = new Linkedlist();
	ll.insertAtEnd(2);
	ll.insertAtEnd(4);
	ll.insertAtEnd(6);
	ll.insertAtEnd(8);
	
	//call Display Function
	ll.display();
}
}
	
		