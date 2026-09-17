
public class AddSalaryOfEmployee {
	String name;
	double Salary;
	int PerHour;
	
	AddSalaryOfEmployee(String n,double s,int p){
		name = n;
		Salary = s;
		PerHour = p;
	}
	public void Info() {
		System.out.println("FinalSalary" + name + "    " + Salary);
		
	}
	public void AddSalary() {
		if(Salary <  500)
			Salary += 10;
		System.out.println("AddSalary" + name + "    "  + "$" + Salary );
	}
	public void  AddWork() {
		if(PerHour > 6) {
			Salary += 5;
			System.out.println("AddSalaryPerHour" + name +  "   "  +  "$" +  Salary);
			
		}
	
	}
}
class Emp{
	public static void main(String [] args) {

	AddSalaryOfEmployee e1= new AddSalaryOfEmployee("Arpita",400,7);
	AddSalaryOfEmployee e2= new AddSalaryOfEmployee("Simmi",300,5);
	
	System.out.println(" Before:" + "Arpita" + " "  + "$400" + " "  + "7" + "Hour");
	System.out.println("Before:" + "simmi" + "  " +  "$300" +  "  " +"5" + "Hour");
	
	
	e1.AddSalary();
	e1.AddWork();
	e1.Info();
	e2.AddSalary();
	e2.AddWork();
	e2.Info();
	
	
}
}

