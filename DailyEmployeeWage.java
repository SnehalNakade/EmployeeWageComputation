package EmployeeWage;

/**
 * @author sneha - Calculate Daily Employee Wage
 *
 */
public class DailyEmployeeWage {
	public static void main(String[] args) {
		// Constants
		int FULL_TIME = 1;
		int RATE_PER_HOUR = 20 ;
		// Variables
		int empHrs=0;
		int empWage=0;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == FULL_TIME)
			empHrs = 8 ;
		else
			empHrs = 0 ;
		
		empWage = empHrs * RATE_PER_HOUR ;
		System.out.println("Employee Wage = " + empWage);
		}
}