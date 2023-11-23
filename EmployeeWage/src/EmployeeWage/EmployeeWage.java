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
	
	private static void monthlywage(int days)
	{
		double amt =  8*20.0*days;
		System.out.println("Monthly wages = "+amt);
	}
	
	private static void wage(int hoursWorked,int days)
	{
		double perHourWage = 20.0;
		double perDayWage = 8*perHourWage;
		double ans1 = perHourWage*hoursWorked;
		double ans2 = perDayWage*days;
		System.out.println("Total wage of working "+hoursWorked+"hrs = "+ans1);
		System.out.println("Total wage of working "+days+"days = "+ans2);		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		System.out.println("Checking Attendance :");
		checkAttendance();
		dailywage(8,20.0);
		partTimeWage(4,20.0);
		System.out.print("Enter hours worked (part-time=4 , full-time=8) : ");
		int hoursWorked = s.nextInt();
		calculateWage(hoursWorked,20.0);
		monthlywage(20);
		wage(100,20);
	}
	
}
