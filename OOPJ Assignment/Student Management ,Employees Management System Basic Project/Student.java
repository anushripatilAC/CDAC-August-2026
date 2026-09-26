
 class Student {
	private int rollNo;
	private String name;
	private String department;
	private double marks;
	
	Student(int rollNo,String name,String department,double marks){
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	public  String getDepartment() {
		return department;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks( double marks) {
		this.marks = marks;
		
	}
	@Override     //if i do not use override printHashcode 
	public  String toString() {
		return rollNo + " " + name + " " + department + " " + marks;
	}

}
