package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
