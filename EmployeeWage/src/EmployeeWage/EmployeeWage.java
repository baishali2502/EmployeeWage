package EmployeeWage;

public class EmployeeWage {
	private static void checkAttendance() {

        double attendanceValue = Math.random();

        if (attendanceValue > 0.5) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Checking Attendance :");
		checkAttendance();
	}
	
}
