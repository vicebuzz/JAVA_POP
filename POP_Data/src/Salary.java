import java.text.DecimalFormat;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

    // Task 1
    /** Increases salary by 200
     * @param salary as salary to be increased (int)
     * @return new salary (int)
     */
    public int salaryIncrease(int salary) {
        return salary + 200;
    }

    // Task 2
    /** Increase salary by 200.5
     * @param salary as salary to be increased (double)
     * @return new salary (double)
     */
    public double salaryIncrease(double salary) {
        return salary + 200.5;
    }

    // Task 3:
    /** Increase salary by a given percentage
     * @param salary as the base salary (double)
     * @param percentage as the percentage salary to be increased (double)
     * @return new salary (double)
     */
    public double salaryIncrease(double salary, double percentage) {
        double increase = salary * (percentage / 100);
        return salary + increase;
    }

    // Task 4
    /** Calculates salary pay after the tax and pension per month
     * @param salary as the base salary (double)
     * @return net salary per month (double)
     */
    public double calculatePay(double salary) {
        return salary * 0.72 / 12;
    }

    // Task 5 - this one is more of a challenge - you can come back to it later
    /** Formats salary in decimal format
     * @param salary as the based salary (double)
     * @return as formatted salary (double)
     */
    public String formatCurrency(double salary) {
        return new DecimalFormat("£###,###,##0.00").format(salary);
    }
}
