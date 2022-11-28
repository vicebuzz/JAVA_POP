
public class Craps {

	//Dice diceRoller;

	/**
	 * first dice object
	 */
	Dice dice1 = new Dice();
	/**
	 * second dice object
	 */
	Dice dice2 = new Dice();

	//Task 1
	/**
	 * roles both dices
	 */
	public void shoot() {
		dice1.roll();
		dice2.roll();
	}
	

	//Task 1
	/** gets the faceValue of the first dice
	 * @return first dices' faceValue attribute (int)
	 */
	public Dice getDice1() {
		return dice1;
	}
	

	//Task 1
	/** gets the faceValue of the second dice
	 * @return second dices' faceValue attribute (int)
	 */
	public Dice getDice2() {
		return dice2;
	}

	//Task 2
	/** adds up score from both dices and returns the sum
	 * @return sum of values from both dices (int)
	 */
	public int addUpScore() {
		return dice1.faceValue + dice2.faceValue;
	}
	

	//Task 3
	/** decides outcome of the game depending on the value of sum of both dices
	 * @param result as the sum of both dices' values
	 * @return result of the game, such as throw again, you win, or you lose (String)
	 */
	public String decideOutcome(int result) {
		if (result == 7 || result == 11){
			return "You win";
		} else if (result == 2 || result == 3 || result == 12){
			return "You lose";
		}
		return "Throw again";
	}
	

	/*Task 4 - No UNIT TEST FOR THIS ONE - Check the output
	public ?? getResults(??) {
		??
	}
	*/

	/*Task 5 - No UNIT TEST FOR THIS ONE - Check the output
	public ?? playCraps(??) {
		??
	}
	*/

	/*Task 6 Additional tasks - OPTIONAL AND NOT ASSESSED
	Can you add a method that asks the user if they want to play again?
	public ?? playAgain(??){

	}*/
}
