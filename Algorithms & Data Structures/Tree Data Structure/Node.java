
public class Node {
	int data;
	Node left;
	Node right;
	 
	//create constructor
	
	Node(int data){
		this.data = data;
		left = null;
		right = null;
		
	}
	
public class Main{
	static Node root = null;  //create variable type is node 
	
//++=========insert+++=======
	
	static Node InsertIntoTree(Node root,int value) {    //create method with return type is Node 
		
		if(root == null) {
			return new Node(value);
			
			
			}
		if(value < root.data) {
			root.left = InsertIntoTree(root.left,value);
			
		}
		if(value > root.data) {
			root.right = InsertIntoTree(root.right,value);
		}
		return root;
	}
	
	//++++++====inOrder++++++==
	static void inOrder(Node root) {
		if(root  != null) {
		inOrder(root.left);
		System.out.print(root.data + "  " );
		inOrder(root.right);
		}
	}
	//++++++++++=====FindElement+++++++===
	  
	static boolean Search(Node root,int key) {
	if(root == null) {
		return false;
	
	}
	if( root.data == key) {
		return true;
	}
	
	if(key < root.data) {
		return Search(root.left,key);
	}
	else {
		return Search(root.right,key);
	}
	
	}
	
	//=======topScore++++++=
	 static int FindMax(Node root) {
		 while(root.right != null){
			 root = root.right;
		 }
	return root.data;
	 }
	
	//++++++==Lowest++++
	 
	 static  int FindLowest(Node root) {
		 while(root.left != null) {
			 root = root.left;
		 }
		 return root.data;
	 }
	
	 public static void main(String[] args) {
		 
		 int[] marks = {72,85,61,90,47,78,55};
		 
		 for(int value:marks) {
			 root = InsertIntoTree(root,value);
		 }
		 
		 //inOder
		 System.out.print("Inoder:" + " ");
		 inOrder(root);
		 
		 System.out.println();
		 //Search
		 System.out.print("Search 90:" + " ");
		 System.out.println(Search(root,90) ? "Found" : "Not Found");
		 
		 //Search
		 System.out.print("Search 100:" + " ");
		 System.out.println(Search(root,100) ? "Found" : "Not Found");
		 
		 
		 //findMax
		 System.out.print("Topper" + " ");
		 System.out.println("Topper: " + FindMax(root));
		 
		 //Lowest
		 
		 System.out.println("Lowest: " + FindLowest(root));
	 }
	}
		 
} 