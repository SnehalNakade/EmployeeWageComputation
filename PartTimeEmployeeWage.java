package EmployeeWage;
/**
 * @author sneha- Calculate Daily Employee Wage
 *
 */
public class PartTimeEmployeeWage {
	public static void main (String[] args) {
	// Constants
	int PART_TIME = 1;
	int FULL_TIME = 2; 
	int RATE_PER_HOUR = 20;
	// Variables
	int empHrs = 0;
	int empWage = 0; 
	// Computation
	double empCheck = Math.floor(Math.random() * 10) % 3 ;
	if (empCheck == PART_TIME) 
		empHrs = 4;
	else { 
		if (empCheck == FULL_TIME)
			empHrs = 8;
		else
			empHrs= 0;
	empWage = empHrs * RATE_PER_HOUR; 
	System.out.println("Emp Wage: "+empWage);
	}
  }	
}