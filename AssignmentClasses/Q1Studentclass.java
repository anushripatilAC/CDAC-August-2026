
public class Q1Studentclass {
			String name;
			int Rollno;
			String PhoneNo;
			String Address;
			
			Q1Studentclass(String name,int Rollno,String PhoneNo,String Address){
				this.name = name;
				this.Rollno = Rollno;
				this.PhoneNo = PhoneNo;
				this.Address = Address;
			}
				public void Display() {
					System.out.println("Name:" + name +  ", RollNo:" + Rollno +  ",PhoneNum:" + PhoneNo + ",Address:" + Address);
				
			}
}
 class Main{
	public static void main(String [] args) {
		Q1Studentclass s1 = new Q1Studentclass("sam",1,"8977655434","Mumbai");
		Q1Studentclass s2 = new Q1Studentclass("john",2,"897764537","Pune");
		  
		s1.Display();
		s2.Display();
	}
}
