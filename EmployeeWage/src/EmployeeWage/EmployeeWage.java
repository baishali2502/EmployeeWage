package EmployeeWage;
import java.util.*;

public class EmployeeWage 
{
	private static void checkAttendance() 
	{
        double attendanceValue = Math.random();

        if (attendanceValue > 0.5) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
	
	private static void dailywage(int fullHours, double wagePerHour) 
	{
        double dailyWage = fullHours * wagePerHour;
        System.out.println("Employee daily wage = "+dailyWage);
    }
	
	private static void partTimeWage(int partHours,double wagePerHour)
	{
		 double partWage = partHours * wagePerHour;
	     System.out.println("Part-time Employee wage = "+partWage);
	}
	
	private static void calculateWage(int hoursWorked, double wagePerHour) {

        final int fullDayHours = 8;
        final int partTimeHours = 4;
        double dailyWage;

        switch (hoursWorked) {
            case fullDayHours:
                dailywage(hoursWorked,wagePerHour);
                break;
            case partTimeHours:
            	partTimeWage(hoursWorked,wagePerHour);
                break;
            default:
                System.out.println("Invalid hours worked.");
                dailyWage = 0.0;
        }
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		System.out.println("Checking Attendance :");
		checkAttendance();
		dailywage(8,20.0);
		partTimeWage(4,20.0);
		System.out.print("Enter hours worked : ");
		int hoursWorked = s.nextInt();
		calculateWage(hoursWorked,20.0);
	}
	
}
