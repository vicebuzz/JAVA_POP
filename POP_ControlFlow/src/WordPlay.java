import java.util.Random;
import java.util.HashMap;
/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {
	
	//Task1
	/** Checks which word comes before in alphabetical order
	 * @param word1 as the first word to compare (String)
	 * @param word2 as the second word to compare (String)
	 * @return string saying which word comes before in the alphabet or if the words are the same (String)
	 */
	public String whatComesFirst(String word1, String word2) {
		String word1_lower = word1.toLowerCase();
        String word2_lower = word2.toLowerCase();
        String return_message = "";
        if (word1_lower.compareTo(word2_lower) < 0){
            return_message += word1 + " comes before " + word2 + " in the alphabet";
        } else if (word1_lower.compareTo((word2_lower)) > 0){
            return_message += word2 + " comes before " + word1 + " in the alphabet";
        } else if (word1_lower.compareTo((word2_lower)) == 0) {
            return_message += word2 + " is the same as " + word1_lower;
        }
        return return_message;
	}

	//Task 2
	/** Reverses a given string
	 * @param str as the string to reverse (String)
	 * @return reversed string (String)
	 */
	public String backwardsString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++){
            reversed += str.charAt(str.length()-i-1);
        }
        return reversed;
	}
	
	//Task 3
	/** Concatenates values from names array to corresponding values from indexes array
	 * @param names as an array of names (String[])
	 * @param indexes as an array of indexes (String[])
	 * @return array of concatenated strings (String[])
	 */
	public String[] addressBook(String[] names, String[] indexes) {
		for (int i = 0; i < names.length; i++){
            names[i] = names[i] + " " + indexes[i];
        }
        return names;
	}
	
	//Task 4
	/** Emulates rock,paper,scissors game with the computer
	 * @param user_choice as the choice of user (String)
	 * @return message about outcome of the game (String)
	 */
	public String rockPaperScissors(String user_choice) {
		String[] choices = {"rock", "paper", "scissors"};
        // all possible game result scenarios are added to a hashmap
        HashMap<String, String> game_endings = new HashMap<String, String>();
        game_endings.put("rock-rock", "Draw");
        game_endings.put("rock-paper", "paper");
        game_endings.put("rock-scissors", "rock");
        game_endings.put("scissors-scissors", "Draw");
        game_endings.put("scissors-paper", "scissors");
        game_endings.put("scissors-rock", "rock");
        game_endings.put("paper-paper", "Draw");
        game_endings.put("paper-rock", "paper");
        game_endings.put("paper-scissors", "scissors");
        // random move is chosen from possible moves by a computer
        Random randomNumberGenerator = new Random();
        int computer_choice_int = randomNumberGenerator.nextInt(3);
        String computer_choice = choices[computer_choice_int];
        // correct game ending is taken from a hashmap
        String game_ending = game_endings.get(user_choice + "-" + computer_choice);
        String message = "";
        // user is informed about the game outcome
        if (game_ending.equals(computer_choice)){
            message = "USER:" +user_choice + " vs " + "COMP:" + computer_choice + " COMPUTER wins";
        } else if (game_ending.equals(user_choice)){
            message = "USER:" +user_choice + " vs " + "COMP:" + computer_choice + " user wins";
        } else if (game_ending.equals("Draw")){
            message = "USER:"+user_choice+" vs "+"COMP:"+computer_choice+" it is a draw";
        }
        return message;
	}
}