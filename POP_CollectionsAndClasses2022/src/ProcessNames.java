import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class ProcessNames {

	//Task 1 - read in all data from a file
	/** reads names from file, which name is passed in the filename parameter, then adds all names to ArrayList and return it
	 * @param filename of the file from which the names will be written
	 * @return ArrayList of all the names from the file (ArrayList<String>)
	 * @throws Exception linked with handled file exceptions
	 */
	public ArrayList<String> readNames(String filename) throws Exception {
		ArrayList<String> names = new ArrayList<String>();
        Scanner reader = new Scanner(new File(filename));
		//String line = reader.nextLine();
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			names.add(line);
		}
		return names;
	}

	//Task 2 - sort the data
	/** sorts strings in the ArrayList alphabetically, then return it
	 * @param data as the ArrayList to be sorted
	 * @return sorted array (ArrayList<String>)
	 */
	public ArrayList<String> sortNames(ArrayList<String> data){
		Collections.sort(data);
		return data;
	}


	//Task3 - find name position
	/** takes in array of elements and returns position of required element
	 * @param names as an ArrayList of elements to scan (ArrayList<String>)
	 * @param name as an element, position of which to find (String)
	 * @return position of name in names (int)
	 */
	public int findNamePosition(ArrayList<String> names, String name) {
		return names.indexOf(name);
	}

	//Task4 - delete name
	/** takes in arrayList and element which to delete, deletes it form it and returns new arrayList
	 * @param names as an ArrayList of elements to scan (ArrayList<String>)
	 * @param name as an element, which to delete (String)
	 * @return new names without name (ArrayList<String>)
	 */
	public ArrayList<String> deleteName(ArrayList<String> names, String name){
		names.remove(name);
		return names;
	}


	//Task5 - change name
	/** takes in arrayList and element which to change and to what, changes it and returns new arrayList
	 * @param names as an ArrayList of elements to scan (ArrayList<String>)
	 * @param old_name as an element to change (String)
	 * @param new_name as to what change old_name (String)
	 * @return new names, with new_name instead of old_name (ArrayList<String>) 
	 */
	public ArrayList<String> changeName(ArrayList<String> names, String old_name, String new_name){
		names.set(names.indexOf(old_name), new_name);
		return names;
	}

}