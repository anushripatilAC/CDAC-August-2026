
public class EmployeeInformation {
	String name;
	String year;
	double salary;
	String Address;
	
	EmployeeInformation(String n,String y,double s,String a){
		name = n;
		year = y;
		salary = s;
		Address = a;
	}
	
	public void Print() {    
		System.out.println(name +  "    " + year + "    " + salary + "   " + Address);
		
	}

}
class Employee{
	
	public static void main(String [] args) {

	EmployeeInformation e1 = new EmployeeInformation("Robert","1994",23000,"64C -wallStreet" );
	EmployeeInformation e2 = new EmployeeInformation("sam","2000", 24000,"68C - wallstreet");
	EmployeeInformation e3 = new EmployeeInformation("john","1999", 5000,"62C - wallstreet");
	System.out.println("Name" +  "    " + "Year" + "   " + "Salary" + "   " + "Addresss");
	
	e1.Print();
	e2.Print();
	e3.Print();
	}
}
	
	
