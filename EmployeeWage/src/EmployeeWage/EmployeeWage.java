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
	
	/*
	 * @desc:This methid checks attendance of employee using Random function
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */
	void checkAttendance() 
	{
        double attendanceValue = Math.random();

        if (attendanceValue > 0.5) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }

	/*
	 * @desc:This method calculates dailywage of employee
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */
	void dailywage() 
	{
        double dailyWage = perHourWage*fullHours;
        System.out.println("Employee daily wage = "+dailyWage);
    }

	/*
	 * @desc:This method calculates part-time wage of employee
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */
	void partTimeWage()
	{
		 double partWage = partHours * perHourWage;
	     System.out.println("Part-time Employee wage = "+partWage);
	}

	/*
	 * @desc:This method calculates employee wage using switchcase
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */
	void calculateWage_usingSwitch() {

        final int fullDayHours = 8;
        final int partTimeHours = 4;
        Random rand = new Random(); 
        int hoursWorked =  rand.nextInt(8); 
        switch (hoursWorked) {
            case fullDayHours:
                dailywage();
                break;
            case partTimeHours:
            	partTimeWage();
                break;
            default:
                System.out.println("Invalid hours worked.");
        }
    }
	
	/*
	 * @desc:This method calculates monthly-wage of employee
	 * 
	 * @params:No. of days worked by employee
	 * 
	 * @returns:void
	 */
	void monthlywage(int days)
	{
		double amt =  fullHours*perHourWage*days;
		System.out.println("Monthly wages = "+amt);
	}

	/*
	 * @desc:This method calculate employee wage for a certain hours and days
	 * 
	 * @params: hours & days worked
	 * 
	 * @return:void
	 */
	void conditional_wage(int hoursWorked,int days)
	{
		double perDayWage = fullHours*perHourWage;
		double ans1 = perHourWage*hoursWorked;
		double ans2 = perDayWage*days;
		System.out.println("Total wage for working "+hoursWorked+"hrs = "+ans1);
		System.out.println("Total wage for working "+days+"days = "+ans2);		
	}
}

public class EmployeeWage 
{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		employee_wage e = new employee_wage(20.0,8,4);
		
	}
	
}
