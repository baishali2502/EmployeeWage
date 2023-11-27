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
	
}

public class EmployeeWage 
{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		employee_wage e = new employee_wage(20.0,8,4);
		
	}
	
}
