package EmployeeWage;
/**
 * @author sneha-Calculate Wages till a condition of total working hours or days is reached for a month
 *
 */
public class CalculateWages {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

	public static void main(String[] args) {
	// Variables
	int empHrs= 0,totalEmpHrs = 0, totalWorkingDays = 8;
	// Computation
	while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <NUM_OF_WORKING_DAYS) {
	totalWorkingDays++;
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empCheck) {
		case PART_TIME:
			empHrs = 4;
			break;

		case FULL_TIME: 
			empHrs = 8;
			break;

		default:
			empHrs = 0;
		}

	totalEmpHrs += empHrs;
	System.out.println("Day#: " + totalWorkingDays + "Emp Hr: "+ empHrs);
		}
	int totalEmpWage = totalEmpHrs * RATE_PER_HOUR;
	System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}