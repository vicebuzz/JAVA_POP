import com.sun.jdi.InvalidTypeException;
import java.io.*;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
/** 
 * FileReading class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class FileReading {

	//Task 1
	/** takes in filename as a parameter and returns contents of that file, each line separated by space from others
	 * @param filename as a filename of the file, contents of which to be outputted (String)
	 * @return string contents of the file (String)
	 * @throws Exception made to throw exceptions, say if the file specified with filename parameter doesn't exist (NoSuchFile ex)
	 */
	public String readName1(String filename) throws Exception {
        File nameFile = new File(filename);
        Scanner fileScan = new Scanner(nameFile);
        String name = "";
        while (fileScan.hasNextLine()) {
           name = name + fileScan.nextLine() + " ";
        }
        fileScan.close();
        return name.trim();
	}

	//Task 2
	/** performs the same function as the last method, but handles various exceptions linked to the filename provided
	 * @param filename as a filename of the file, contents of which to be outputted and exceptions for which to be handled(String)
	 * @return string contents of the file (String)
	 */
	public String readName2(String filename){
        try{
            return readName1(filename);
        } catch (FileNotFoundException ex){
            return "Invalid filename";
        } catch (Exception ex){
            return "Unknown error";
        }
    }

	//Task 3
	/** returns array of 10 names from the file, which name is specified in parameter filename
	 * @param filename of the file to be scanned (String)
	 * @return array with the length of 10 Strings. If file has less than 10 names, the rest of array are empty Strings (String[])
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public String[] readNames(String filename) throws Exception {
        String[] names = new String[10];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        int count_array = 0;
        while (line != null){
            names[count_array] = line;
            line = reader.readLine();
            count_array++;
        }
        reader.close();
        return names;
	}

	//Task 4
	/** returns array of 20 numbers from the file, which name is specified in parameter filename
	 * @param filename of the file to be scanned (String)
	 * @return array with the length of 20 Integers. If file has less than 20 Integers, the rest of array are 0's (int[])
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public int[] readNumbers1(String filename) throws Exception {
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        int count_array = 0;
        while (line != null){
            numbers[count_array] = Integer.parseInt(line);
            line = reader.readLine();
            count_array++;
        }
        reader.close();
        return numbers;
    }

	//Task5
	/** performs the same function as the last method, but catches wrong data type exception, if the line to be scanned doesn't contain Integers
	 * @param filename of the file to be scanned (String)
	 * @return array with the length of 20 Integers. If file has less than 20 Integers, the rest of array are 0's (int[])
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public int[] readNumbers2(String filename) throws Exception {
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        int count_array = 0;
        while (line != null){
            try{
                numbers[count_array] = Integer.parseInt(line);
                line = reader.readLine();
                count_array++;
            } catch (java.lang.NumberFormatException e){
                line = reader.readLine();
            }
        }
        reader.close();
        return numbers;
	}

	//Task 6
	/** scans file, which name is passed in parameter filename and outputs names next to their address index from it
	 * @param filename of the file to be scanned (String)
	 * @return array of concatenated strings of name and address index (String[])
	 * @throws Exception linked with the file handling, such as FileNotFound or NoSuchElement exceptions
	 */
	public String[] readAddressBook(String filename) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader((filename)));
        String[] address_names = new String[5];
        String name = reader.readLine();
        String address = reader.readLine();
        int count_array = 0;
        while (name != null){
            address_names[count_array] = name + ": " + address;
            name = reader.readLine();
            address = reader.readLine();
            count_array++;
        }
        return address_names;
	}
}
