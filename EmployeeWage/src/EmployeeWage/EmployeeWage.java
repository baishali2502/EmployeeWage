package EmployeeWage;
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
	
}

