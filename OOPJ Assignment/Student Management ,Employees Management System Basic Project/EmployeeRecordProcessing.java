import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class EmployeeRecordProcessing {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101,"Anushri","IT",60000,1));
		employees.add(new Employee(102,"Mohii","Cs",50000,2));
		employees.add(new Employee(103,"mayuri","java",90000,2));
		employees.add(new Employee(104,"purva","Cs",70000,1));
		
		System.out.println("-------All Employees------");
	
		employees.forEach(System.out::println);
		
		System.out.println("=========Sort Salary By Descending=======");
		
		employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.forEach(System.out::println);
			
		System.out.println("==========Sort by department and salary descending===========");
		
		employees.stream()
			.sorted(
				Comparator.comparing(Employee::getSalary).reversed()
			.thenComparing(
					Comparator.comparing(Employee::getDepartment)))
			.forEach(System.out::println);
		
		System.out.println("=======Display Empployee salary greater than 50000=======");
		
		employees.stream()
			.filter(e -> e.getSalary() > 50000)		//use lamda expression and stream
			.forEach(System.out::println);
		
		System.out.println("========Max salary=========");
		
		Employee maxSalary =employees.stream()
			.max(Comparator
					.comparing(Employee::getSalary))
					.get();
		System.out.println(maxSalary);

		
		System.out.println("======min salary=======");
		
		Employee minSalary = employees.stream()
			.min(Comparator
					.comparing(Employee::getSalary))
					.get();
					System.out.println(minSalary);
					
		System.out.println("=========count employee in department=====");
		
			
			
		
		
	}

}
