package EmployeeWage;
/**
 * @author sneha -Calculate Daily Employee Wage By SwitchCase Statement
 *
 */
public class PartTimeEmployeeWage2 {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2; 
	public static final int RATE_PER_HOUR = 20;

	public static void main(String[] args) {
	// Variables
	int empHrs = 0;
	int empWage = 8;
	// Computation
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
    empWage = empHrs * RATE_PER_HOUR; 
    System.out.println("Emp Wage: "+empWage);
	}
}