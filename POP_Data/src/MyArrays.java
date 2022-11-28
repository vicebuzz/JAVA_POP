/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

import java.util.Random;
public class MyArrays {

    // Task 1
    /** Adds five numbers from the user
     * @param num1 as 1st number to add (int)
     * @param num2 as 2nd number to add (int)
     * @param num3 as 3rd number to add (int)
     * @param num4 as 4th number to add (int)
     * @param num5 as 5th number to add (int)
     * @return sum of all numbers (int)
     */
    public int addUpNumbers(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    // Task 2

    /** Adds up array of numbers
     * @param numbers as array of numbers to add (int[])
     * @return sum of the numbers int eh array (int)
     */
    public int addUpNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }


    // Task 3

    /** Calculates average of array of numbers
     * @param numbers as array of numbers to find average among(int[])
     * @return average of the sum of numbers (double)
     */
    public double averageOfNumbers(int[] numbers) {
        double sum = 0;
        for (double i:numbers){
            sum += i;
        }
        double avg = sum / numbers.length;
        return avg;
    }


    // Task 4

    /** Performs conversion from celsius to fahrenheit on array of integers
     * @param celsius as an array of numbers in celsius (int[])
     * @return array of numbers as fahrenheit (int[])
     */
    public int[] convertToCelsius(int[] celsius) {

        for (int i = 0; i < celsius.length; i++){
            int fahrenheit = (celsius[i] - 32) * 5/9;
            celsius[i] = fahrenheit;
        }
        return celsius;
    }


    // Task 5

    /** Adds unit marks to corresponding value in array of unit codes. Also calculates the average of marks.
     * @param marks as an array containing unit marks (int[])
     * @return array containing values of unit codes corresponding to values of unit marks and average of all unit marks (String[])
     */
    public String[] unitMarks(int[] marks) {
        String[] marks_array = 	{"APP:", "BSAD:", "CF:", "DAD:", "N&CS:", "POP:", "Average:"};
        for(int i = 0; i < marks.length; i++){
            String text = marks_array[i] + marks[i];
            marks_array[i] = text;
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        double avg = sum / marks.length;
        marks_array[6] = marks_array[6]+avg;
        return marks_array;
    }


    // Task 6

    /** Gets array of names and picks random name from an array to make it a winner
     * @param choices as an array of names, winner to be picked from (String[])
     * @return random chosen name from an array (String)
     */
    public String andTheWinnerIs(String[] choices) {
        Random randomNumberGenerator = new Random();
        int winnerIs = randomNumberGenerator.nextInt(choices.length);
        return choices[winnerIs];
    }

}
