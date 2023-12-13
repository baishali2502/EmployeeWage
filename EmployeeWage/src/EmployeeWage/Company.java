package EmployeeWage;

//@desc:Company class extends employee_wage class. This way each company will have it's own perHourWage, fullHours, partHours

public class Company extends employee_wage
{
	private String companyName;
    private double totalWage; // stores totalwage

    public Company(String companyName, double perHourWage, int fullHours, int partHours, int workingDaysPerMonth) {
        super(perHourWage, fullHours, partHours, workingDaysPerMonth);
        this.companyName = companyName;
    }

}
