import java.io.*;
public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    //  (Getters)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public double getSalary() { return salary; }

    // Mutators (Setters)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setSalary(double salary) { this.salary = salary; }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

// Derived class
class PrimeMembers extends Member {
    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    //Getters
    public int getJoiningYear() { return joiningYear; }
    public double getJoiningFees() { return joiningFees; }
    public boolean getIsActive() { return isActive; }

    //Setters
    public void setJoiningYear(int joiningYear) { this.joiningYear = joiningYear; }
    public void setJoiningFees(double joiningFees) { this.joiningFees = joiningFees; }
    public void setIsActive(boolean isActive) { this.isActive = isActive; }

    // Method to display all fields
    public void display() {
        System.out.println("\n--- Member Details ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        printSalary();
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: $" + joiningFees);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}


class consoleInput {
    public static String getString() {
        try {
            byte arrInput[] = new byte[100];
            int length = System.in.read(arrInput);
            if (length <= 0) return "";
            // '\r\n' (Enter key) ko handle karne ke liye
            int count = (length >= 2 && arrInput[length - 2] == '\r') ? length - 2 : length - 1;
            if (count < 0) count = 0;
            byte[] arrFinal = new byte[count];
            System.arraycopy(arrInput, 0, arrFinal, 0, count);
            return new String(arrFinal);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getInt() {
        return Integer.parseInt(getString().trim());
    }

    public static float getFloat() {
        return Float.parseFloat(getString().trim());
    }

    public static double getDouble() {
        return Double.parseDouble(getString().trim());
    }

    public static boolean getBoolean() {
        return Boolean.parseBoolean(getString().trim());
    }
}


 class  UseGetSet {
    public static void main(String[] args) {
        PrimeMembers pm = new PrimeMembers();

        // Custom consoleInput helper class se input le rahe hain
        System.out.print("Enter Name: ");
        pm.setName(consoleInput.getString());

        System.out.print("Enter Age: ");
        pm.setAge(consoleInput.getInt());

        System.out.print("Enter Phone Number: ");
        pm.setPhoneNumber(consoleInput.getString());

        System.out.print("Enter Address: ");
        pm.setAddress(consoleInput.getString());

        System.out.print("Enter Salary: ");
        pm.setSalary(consoleInput.getDouble());

        System.out.print("Enter Joining Year: ");
        pm.setJoiningYear(consoleInput.getInt());

        System.out.print("Enter Joining Fees: ");
        pm.setJoiningFees(consoleInput.getDouble());

        System.out.print("Is Active? (true/false): ");
        pm.setIsActive(consoleInput.getBoolean());

        // Displaying all details
        pm.display();
    }
}
