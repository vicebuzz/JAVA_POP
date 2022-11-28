import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/**
 * UserInput class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class UserInput {
	//Task 1
	/** asks user for its name and greets him
	 * @return concatenated string of word Hello and user's name
	 */
	public String sayHello() {
        System.out.println("Enter your name: ");
		Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        keyboard.close();
        return "Hello " + name;
	}

	//Task 2
	/** asks user for a number ten times, then returns array of those numbers
	 * @return array of user inputted numbers (int[])
	 */
	public int[] readTenNumbers() {
        Scanner keyboard = new Scanner(System.in);
        int[] new_array = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number: ");
            int new_number = keyboard.nextInt();
            new_array[i] = new_number;
        }
        keyboard.close();
        return new_array;
	}

	//Task 3
	/** asks user for a name ten times, then adds all of them into an array
	 * @return array of user inputted names (String[])
	 */
	public String[] readTenNames() {
        Scanner keyboard = new Scanner(System.in);
        String[] new_array = new String[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Enter a name: ");
            String new_name = keyboard.next();
            new_array[i] = new_name;
        }
        keyboard.close();
		return new_array;
	}
}
