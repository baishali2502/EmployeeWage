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
	
	private static void dailywage(int hoursWorked, double wagePerHour) 
	{
        double dailyWage = hoursWorked * wagePerHour;
        System.out.println("Employee daily wage = "+dailyWage);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Checking Attendance :");
		checkAttendance();
		dailywage(8,20.0);
	}
	
}
