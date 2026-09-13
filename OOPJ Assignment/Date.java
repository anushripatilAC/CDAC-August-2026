
public class Date {

    private int day;
    private int month;
    private int year;

    // Setter / Mutator
    public void setDate(int dd, int mm, int yy) {

        year = yy;

        if (mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;

        if (dd < 1 || dd > getDaysInMonth(month, year))
            day = 1;
        else
            day = dd;
    }

    // Check Leap Year
    private boolean isLeapYear(int y) {

        if (y % 400 == 0)
            return true;

        if (y % 100 == 0)
            return false;

        if (y % 4 == 0)
            return true;

        return false;
    }

    // Get number of days in month
    private int getDaysInMonth(int m, int y) {

        if (m == 2) {

            if (isLeapYear(y))
                return 29;
            else
                return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;

        return 31;
    }

    // Add Days
    public void addDays(int days) {

        for (int i = 0; i < days; i++) {

            day++;

            if (day > getDaysInMonth(month, year)) {

                day = 1;
                month++;

                if (month > 12) {

                    month = 1;
                    year++;
                }
            }
        }
    }

    // Add Months
    public void addMonths(int months) {

        for (int i = 0; i < months; i++) {

            month++;

            if (month > 12) {

                month = 1;
                year++;
            }
        }

        // Adjust day if required
        if (day > getDaysInMonth(month, year))
            day = getDaysInMonth(month, year);
    }

    // Add Years
    public void addYears(int years) {

        year = year + years;

        // 29 February adjustment
        if (month == 2 && day == 29 && !isLeapYear(year))
            day = 28;
    }

    // Display Date
    public void display() {

        System.out.println(day + "/" + month + "/" + year);
    }
}