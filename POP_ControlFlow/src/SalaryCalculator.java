/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
import java.util.Arrays;
public class SalaryCalculator {

	//Task 1
	/** Calculates net salary after subtracting corresponding to the salary size tax from it
	 * @param salary as the salary (double)
	 * @return net salary (double)
	 */
	public double salaryTax(double salary) {
		if (salary >= 45000){
            return salary*0.5;
        } else if (salary >= 30000 && salary < 45000){
            return salary * 0.7;
        } else {
            return salary * 0.85;
        }
        //return 0;
	}

	//Task 2
	/**Calculates NI number for salary in the provided category
	 * @param salary as the base salary (double)
	 * @param category as a category of the user (char)
	 * @return net salary after subtracting NI from it (double)
	 */
	public double calculateNI(double salary, char category) {
		if (category == 'A'){
            return salary * 0.88;
        } else if (category == 'B'){
            return salary * 0.9415;
        } else if (category == 'C'){
            return salary * 0.98;
        }
        return salary;
	}
	
	//Task 3
	/** Calculates total of the salaries in the array
	 * @param arr as an array of salaries (double[])
	 * @return sum of all salaries (double)
	 */
	public double salaryTotal(double[] arr) {
        return Arrays.stream(arr).sum();
	}

	// Task 4 
	/** Calculates average salary from array of salaries
	 * @param arr as an array of salaries (double[])
	 * @return average salary (double)
	 */
	public double salaryAverage(double[] arr) {
		double sum = Arrays.stream(arr).sum();
        return sum / arr.length;
	}

	//Task 5 
	/** Increases all salaries in the array by 5 %
	 * @param arr as an array of salaries (double[])
	 * @return new salary array (double[])
	 */
	public double[] salaryIncrease(double[] arr) {
		for (int i = 0; i < arr.length; i++){
            arr[i] += arr[i] * 0.05;
        }
        return arr;
    }
}
