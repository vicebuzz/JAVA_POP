import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
/**
 * FileWriting class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class FileWriting {

	//Task 1
	/** takes in name as a parameter and writes each name from it on the new line
	 * @param name as a name to be split into several names split by spaces and to be written on separate lines in the file (String)
	 * @return filename of the newly created file, where name is written (String)
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public String writeYourName(String name) throws Exception {
        String[] names = name.split(" ");
        PrintWriter out = new PrintWriter(name+".txt");
        for (int i = 0; i < (names.length-1);i++){
            out.println(names[i]);
        }
        out.print(names[(names.length-1)]);
        out.close();
        return name+".txt";
	}
	
	//Task 2
	/** generates specific number of random digits between 1000 and 9999 including, then writes them to a file
	 * @param top specifies amount of numbers to be generated and written to the file (int)
	 * @return filename of the file where numbers are written (String)
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public static String writeRandomNumbers(int top) throws Exception {
        PrintWriter out = new PrintWriter("randomNumbersFileToWrite.txt");
        Random rand = new Random();
        for (int i = 0; i < (top-1); i++){
            int number = rand.nextInt(8999)+1000;
            out.println(number);
        }
        int number = rand.nextInt(8999)+1000;
        out.print(number);
        out.close();
        return "randomNumbersFileToWrite.txt";
	}
}
