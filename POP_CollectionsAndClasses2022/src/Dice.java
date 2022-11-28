import java.util.Random;
public class Dice {

	/**
	 * global variable faceValue changes when dice is rolled
	 */
	int faceValue = 0;

	//Task 1
	/**
	 * roles the dice and changes faceValue
	 */
	public void roll() {
		Random rand = new Random();
		faceValue = rand.nextInt(6)+1;
	}
	

	//Task 1 - second bit
	/** gets and returns faceValue
	 * @return the value of faceValue (int)
	 */
	public int getFaceValue() {
		return faceValue;
	}
	

	//Task 2
	/* (non-Javadoc) converts faceValue to string and returns it
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return String.valueOf(faceValue);
	}

}
