#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Employee
{
private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:

    // Constructor
    Employee()
    {
        employeeCount++;
        empId = 1000 + employeeCount;

        name = "";
        department = "";
        grade = ' ';
        basicSalary = 0;
        isActive = true;
    }

    // Setters

    void setName(const string& n)
    {
        if (n.empty())
        {
            cout << "ERROR: Name cannot be empty." << endl;
        }
        else
        {
            name = n;
        }
    }

    void setDepartment(const string& dep)
    {
        if (dep == "Engineering" ||
            dep == "HR" ||
            dep == "Finance" ||
            dep == "Operations")
        {
            department = dep;
        }
        else
        {
            cout << "ERROR: '" << dep
                 << "' is not a registered department."
                 << endl;
        }
    }

    void setGrade(char g)
    {
        if (g == 'A' || g == 'B' ||
            g == 'C' || g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '" << g
                 << "'. Accepted values: A, B, C, D."
                 << endl;
        }
    }

    void setBasicSalary(double salary)
    {
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between "
                 << "Rs.10,000 and Rs.5,00,000. "
                 << "Value rejected." << endl;
        }
    }

    void deactivate()
    {
        isActive = false;
    }

    // Getters

    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }

    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }

    // Allowances calculation

    double computeAllowances() const
    {
        if (grade == 'A')
            return basicSalary * 0.40;

        else if (grade == 'B')
            return basicSalary * 0.30;

        else if (grade == 'C')
            return basicSalary * 0.20;

        else if (grade == 'D')
            return basicSalary * 0.10;

        return 0;
    }

    // Gross Salary

    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }

    // Tax Calculation

    double computeTax() const
    {
        double gross = computeGrossSalary();

        if (gross <= 50000)
        {
            return 0;
        }
        else if (gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    // Net Salary

    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }

    // Print Payslip

    void printPayslip() const
    {
        if (!isActive)
        {
            cout << name
                 << " is no longer active. Payroll skipped."
                 << endl;
            return;
        }

        cout << fixed << setprecision(2);

        cout << "\n====================================\n";
        cout << "          EMPLOYEE PAYSLIP\n";
        cout << "====================================\n";

        cout << "Emp ID      : " << empId << endl;
        cout << "Name        : " << name << endl;
        cout << "Department  : " << department << endl;
        cout << "Grade       : " << grade << endl;
        cout << "Status      : "
             << (isActive ? "Active" : "Inactive")
             << endl;

        cout << "------------------------------------\n";

        cout << "Basic Salary : Rs. "
             << basicSalary << endl;

        cout << "Allowances   : Rs. "
             << computeAllowances() << endl;

        cout << "Gross Salary : Rs. "
             << computeGrossSalary() << endl;

        cout << "------------------------------------\n";

        cout << "Tax Deduction : Rs. "
             << computeTax() << endl;

        cout << "Net Salary    : Rs. "
             << computeNetSalary() << endl;

        cout << "====================================\n";
    }

    // Accept details

    void acceptDetails()
    {
        string n;
        string dep;
        char g;
        double salary;

        cout << "\nEnter name: ";
        getline(cin >> ws, n);
        setName(n);

        cout << "Enter department: ";
        getline(cin, dep);
        setDepartment(dep);

        cout << "Enter grade: ";
        cin >> g;
        setGrade(g);

        cout << "Enter basic salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }

    // Static function

    static int getEmployeeCount()
    {
        return employeeCount;
    }
};


// Static variable definition

int Employee::employeeCount = 0;


int main()
{
    // One object on Stack
    Employee e1;

    // Two objects on Heap
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();


    // Accept details

    cout << "\n--- Employee 1 ---\n";
    e1.acceptDetails();

    cout << "\n--- Employee 2 ---\n";
    e2->acceptDetails();

    cout << "\n--- Employee 3 ---\n";
    e3->acceptDetails();



    // Print Payslips

    cout << "\n--- PAYSLIP 1 ---\n";
    e1.printPayslip();

    cout << "\n--- PAYSLIP 2 ---\n";
    e2->printPayslip();

    cout << "\n--- PAYSLIP 3 ---\n";
    e3->printPayslip();


    // Simulate resignation

    e3->deactivate();

    if (!e3->getIsActive())
    {
        cout << "\n"
             << e3->getName()
             << " is no longer active. Payroll skipped."
             << endl;
    }


    // Total employees

    cout << "\nTotal Employees: "
         << Employee::getEmployeeCount()
         << endl;


    // Delete heap objects

    delete e2;
    delete e3;

    return 0;
}