package EmployeeWage;
import java.util.*;

class employee_wage
{
	double perHourWage;
	int fullHours;
	int partHours;
	
	employee_wage(double perHourWage,int fullHours,int partHours)
	{
		this.perHourWage=perHourWage;
		this.fullHours = fullHours;
		this.partHours = partHours;
	}
	void checkAttendance() 
	{
        double attendanceValue = Math.random();

        if (attendanceValue > 0.5) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
	
	void dailywage() 
	{
        double dailyWage = perHourWage*fullHours;
        System.out.println("Employee daily wage = "+dailyWage);
    }
	
	void partTimeWage()
	{
		 double partWage = partHours * perHourWage;
	     System.out.println("Part-time Employee wage = "+partWage);
	}
	
	void calculateWage(int hoursWorked) {

        final int fullDayHours = 8;
        final int partTimeHours = 4;
        double dailyWage;
        
        switch (hoursWorked) {
            case fullDayHours:
                dailywage();
                break;
            case partTimeHours:
            	partTimeWage();
                break;
            default:
                System.out.println("Invalid hours worked.");
                dailyWage = 0.0;
        }
    }
	
    void monthlywage(int days)
	{
		double amt =  fullHours*perHourWage*days;
		System.out.println("Monthly wages = "+amt);
	}
	
	void wage(int hoursWorked,int days)
	{
		double perDayWage = fullHours*perHourWage;
		double ans1 = perHourWage*hoursWorked;
		double ans2 = perDayWage*days;
		System.out.println("Total wage for working "+hoursWorked+"hrs = "+ans1);
		System.out.println("Total wage for working "+days+"days = "+ans2);		
	}
	
}

class company1 extends employee_wage
{
	static double perHourWage;
	static int fullHours;
	static int partHours;
	
	company1(double perHourWage,int fullHours,int partHours)
	{
		super(perHourWage,fullHours,partHours);
	}
}
public class EmployeeWage 
{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		employee_wage e = new employee_wage(20.0,8,4);
		e.dailywage();
		company1 c = new company1(30.0,6,3);
		c.dailywage();
		
		/*
		 * System.out.print("Checking Attendance :"); employee_wage e = new
		 * employee_wage(); e.checkAttendance(); // checks attendance e.dailywage(); //
		 * calculates employee full-time daily wage e.partTimeWage(); // calculates
		 * employee part-time wage
		 * System.out.print("Enter hours worked (part-time=4 , full-time=8) : "); int
		 * hoursWorked = s.nextInt(); e.calculateWage(hoursWorked); e.monthlywage(20);
		 * e.wage(100,20);
		 */
	}
	
}
