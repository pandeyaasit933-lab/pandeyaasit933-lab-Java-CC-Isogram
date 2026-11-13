import java.util.HashSet;
import java.util.Set;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     * 
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * 
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str) {
        if (str == null) {
            return true;
        }
        
        Set<Character> seenLetters = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the set already contains the character, it's not an isogram
            if (!seenLetters.add(c)) {
                return false;
            }
        }
        
        return true;
    }
}