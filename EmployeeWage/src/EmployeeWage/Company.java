package EmployeeWage;

//@desc:Company class extends employee_wage class. This way each company will have it's own perHourWage, fullHours, partHours

public class Company extends employee_wage
{
	Company(double perHourWage, int fullHours, int partHours) {
		super(perHourWage, fullHours, partHours);
		
	}
	String companyname;
	int cid;

}
