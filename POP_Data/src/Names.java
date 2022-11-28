/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

    // Task 1
    /** Converts the name to upper case
     * @param name as the name to be converted to upper case (String)
     * @return name in upper case (String)
     */
    public String upperCaseName(String name) {
        return name.toUpperCase();
    }

    // Task 2

    /** Concatenates firstname and lastname together with space in between
     * @param firstname as the first name (String)
     * @param lastname  as the last name (String)
     * @return concatenated string with first name, last name and space between them (String)
     */
    public String fullName(String firstname, String lastname) {
        return firstname + ' ' + lastname;
    }

    // Task 3

    /** Count amount of symbols in the name
     * @param name as the name to be calculated number of symbols from (String)
     * @return number of symbols in the name (int)
     */
    public int letterCount(String name) {
        return name.length();
    }

    // Task 4
    /** Checks if the two names are the same
     * @param name1 as the first name in the comparison (String)
     * @param name2 as the second name in the comparison (String)
     * @return true if the names are the same, false if they're not (boolean)
     */
    public boolean theSameName(String name1, String name2) {
        return name1.toLowerCase().equals(name2.toLowerCase());
    }

    // Task 5
    /** Correct the case in the name string (first letter upper case, rest is lower case)
     * @param name as the string to be corrected (String)
     * @return corrected name string (String)
     */
    public String properCaseName(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase();
    }
}
