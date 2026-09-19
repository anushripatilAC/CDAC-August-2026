
public class Parent1 {
		void DisplayParent() {
			System.out.println("This is Parent Class");
		}
}
class Child2 extends Parent1{
	void DisplayChild() {
		System.out.println("This is Child Class");
	}
}
class ChildParent{
	public static void main(String[] args){
		Parent1 p = new Parent1();
		p.DisplayParent();
		Child2  c = new Child2();
		c.DisplayChild();
		c.DisplayParent();
	}
}
