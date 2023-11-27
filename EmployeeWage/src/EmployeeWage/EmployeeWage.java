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
	
}

public class EmployeeWage 
{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program\n");
		employee_wage e = new employee_wage(20.0,8,4);
		
	}
	
}
