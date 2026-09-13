class StudentClassP {
    String name;
    int roll_no;
    String phone_no;
    String address;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(String name, int roll_no, String phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no + 
                           ", Phone: " + phone_no + ", Address: " + address);
    }
}

public class Main1 {
    public static void main(String[] args) {
   
        Student s1 = new Student();
        s1.name = "John";
        s1.roll_no = 2;
        System.out.println("Part A -> Name: " + s1.name + ", Roll No: " + s1.roll_no);

        
        Student sam = new Student("Sam", 1, "9876543210", "123 Main St");
        Student john = new Student("John", 2, "9123456789", "456 Park Ave");

        System.out.println("\nPart B ->");
        sam.display();
        john.display();
    }
}