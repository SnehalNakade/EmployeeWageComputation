package EmployeeWage;
/**
 * @author sneha-Check Employee is Present or Absent
 *
 */
public class EmployeeWageAttendance {
	public static void main(String[] args) { 
		// Constants
		int FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == FULL_TIME)
			System.out.println("Employee is Present");
		else
		System.out.println("Employee is Absent");
		}
}
