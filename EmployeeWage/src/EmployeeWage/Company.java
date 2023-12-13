package EmployeeWage;

//@desc:Company class extends employee_wage class. This way each company will have it's own perHourWage, fullHours, partHours

public class Company extends employee_wage
{
	private String companyName;
    private double totalWage; // stores totalwage of employee
    private double dailywage; // stores dailywage of employee

    public Company(String companyName, double perHourWage, int fullHours, int partHours, int workingDaysPerMonth) {
        super(perHourWage, fullHours, partHours, workingDaysPerMonth);
        this.companyName = companyName;
        this.dailywage = dailywage();
        this.totalWage = calculateEmployeeWage();
    }

	public void setTotalWage(double totalWage) {
		this.totalWage = totalWage;
		
	}

//  @desc:This method gets totoal-wage of employee
	public double getTotalWage()
	{
		return totalWage;
	}

	public void displayTotalWage() {
		System.out.println("Total wage for company -"+companyName+" = "+totalWage);
	}

}
