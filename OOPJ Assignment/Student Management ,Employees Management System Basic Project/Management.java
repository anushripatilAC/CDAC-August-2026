import java.util.ArrayList;
import java.util.Comparator;
public class Management{
	public static void main(String[] args){
		ArrayList  <Student> students = new ArrayList<>();
		students.add(new Student(101,"anushri","CS",92));		//add students
		students.add(new Student(102,"arpita","Entc", 78));

		students.add(new Student(103,"Simmi","IT",88));
		students.add(new Student(104,"ruhi","Mechnical",99));
		System.out.println("All Students:");
		
		for(Student s :students ) {							//Display all students
			System.out.println(s);
		}
		
		int SearchRollNo = 102;
		for(Student s: students) {
		if(s.getRollNo() == SearchRollNo) {
			System.out.println("Student Found");				//Search Student
			System.out.println(s);
			}
		}
		
		int UpdateRollNo = 101;
		for (Student s: students) {
		if(s.getRollNo() == UpdateRollNo) {					//update 
			s.setMarks(87);
			System.out.println("marks Updated");
		}
			
		}
		  
		int deleteRoll = 103;
		{
			students.removeIf(s -> s.getRollNo() == deleteRoll);   			//lambdaExpression
			System.out.println("Remove Student Roll is 103");
		}
		
		students.sort(Comparator.comparingDouble(Student::getMarks).reversed());    //sort  based on marks
		
		for(Student s :students) {
			System.out.println(s);
		}
		
		
	}
}
