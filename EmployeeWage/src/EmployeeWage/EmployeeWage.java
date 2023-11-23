package EmployeeWage;

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
	     System.out.println("Employee daily wage = "+partWage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Checking Attendance :");
		checkAttendance();
		dailywage(8,20.0);
		partTimeWage(4,20.0);
	}
	
}
