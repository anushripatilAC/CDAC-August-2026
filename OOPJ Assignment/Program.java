
public class Program {

    public static void main(String[] args) {

        Date date = new Date();

        int choice;

        do {

            System.out.println();
            System.out.println("===== CALENDAR MENU =====");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = ConsoleInput.getInt();


            switch (choice) {

            case 1:

                System.out.println();
                System.out.println("Enter Date");

                System.out.print("Enter day: ");
                int dd = ConsoleInput.getInt();

                System.out.print("Enter month: ");
                int mm = ConsoleInput.getInt();

                System.out.print("Enter year: ");
                int yy = ConsoleInput.getInt();

                date.setDate(dd, mm, yy);

                System.out.println("Date set successfully.");
                date.display();

                break;


            case 2:

                System.out.print("How many days to add: ");

                int days = ConsoleInput.getInt();

                if (days < 0) {

                    System.out.println("Invalid number of days.");

                } else {

                    date.addDays(days);

                    System.out.println("Date after adding days:");
                    date.display();
                }

                break;


            case 3:

                System.out.print("How many months to add: ");

                int months = ConsoleInput.getInt();

                if (months < 0) {

                    System.out.println("Invalid number of months.");

                } else {

                    date.addMonths(months);

                    System.out.println("Date after adding months:");
                    date.display();
                }

                break;


            case 4:

                System.out.print("How many years to add: ");

                int years = ConsoleInput.getInt();

                if (years < 0) {

                    System.out.println("Invalid number of years.");

                } else {

                    date.addYears(years);

                    System.out.println("Date after adding years:");
                    date.display();
                }

                break;


            case 5:

                System.out.println("Current Date:");
                date.display();

                break;


            case 6:

                System.out.println("Program Exit.");

                break;


            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }
}             