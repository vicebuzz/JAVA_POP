import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

		// Task 1
		/** Checks which number is higher among the two provided
		 * @param num1 1st number (int)
		 * @param num2 2nd number (int)
		 * @return highest number (int)
		 */
		public int highestOfTwo(int num1, int num2) {
            if (num1 > num2) {
                return num1;
            } else if (num2 > num1){
                return num2;
            }
            return -1;
        }
	
		// Task 2
		/** Checks which grade is mark corresponds to
		 * @param grade as marks (int)
		 * @return grade corresponding to the marks or fail or invalid mark (String)
		 */
		public String calculateGrade(int grade) {
			if (grade >= 0 && grade < 40){
                return "Fail";
            } else if (grade >= 40 && grade < 50){
                return "3rd";
            } else if (grade >= 50 && grade < 60){
                return "2ii";
            } else if (grade >= 60 && grade < 70){
                return "2i";
            } else if (grade >= 70 && grade <= 100){
                return "1st";
            }
            return "Invalid mark";
		}
		
		// Task 3
		/** Emulates coin flip with user input
		 * @param choice as user's choice of heads or tails (String)
		 * @return message that says if the guess is correct or not (String)
		 */
		public String headsOrTails(String choice) {
            Random randomNumberGenerator = new Random();
            int headsTails = randomNumberGenerator.nextInt(2);
            if (headsTails == 0 && choice == "tails"){
                return "Correct: you guessed tails and I flipped tails";
            } else if (headsTails == 0 && choice == "heads"){
                return "Incorrect: you guessed heads and I flipped tails";
            } else if (headsTails == 1 && choice == "tails"){
                return "Incorrect: you guessed tails and I flipped heads";
            } else if (headsTails == 1 && choice == "heads"){
                return "Correct: you guessed heads and I flipped heads";
            }
            return "Invalid choice";
		}
		
		// Task 4
		/** Calculates algebraic factorial of the number, but instead of multiplying, sums them all up
		 * @param top_limit as limit of the numbers to sum (int)
		 * @return sum of all the number before the limit (int)
		 */
		public int sumFromOneToWhat(int top_limit) {
			int sum = 0;
            for (int i = 0; i <= top_limit; i++){
                sum += i;
            }
            return sum;
		}
		
		// Task 5
		/** Calculates algebraic factorial of the number, but instead of multiplying, sums them all up with both upper and bottom limit
		 * @param bottom_limit as the bottom limit of the numbers to sum (int)
		 * @param top_limit as the top limit of the numbers to sum (int)
		 * @return sum of all numbers after the bottom limit and  before the top limit (int)
		 */
		public int sumFromWhatToWhat(int bottom_limit, int top_limit) {
			int sum = 0;
            for (int i = bottom_limit; i <= top_limit; i++){
                sum += i;
            }
            return sum;
		}
}
