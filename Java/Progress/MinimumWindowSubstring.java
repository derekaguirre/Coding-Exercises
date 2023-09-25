package Progress;

import java.util.HashMap;
import java.util.Map;

//Submission: 

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        String result = "";
        if (t.length() > s.length())
            return result;
        

        //TODO Change from boolean to int and increment/decrement occurrences instead of checking T/F
        //Populate with either pos or negative occurrences 
        //Consider "finished" algo containing all 0 values in map
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();
        int start = 0;
        int end = 0;
        // Populate hash table with keys from "t" string
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), false);
        }
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        // A D O B E C O D E B A N C
        int charsFound = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("end: " + s.charAt(i));
            // If char exists
            if (map.containsKey(s.charAt(i))) {
                // Char hasn't been seen
                if (map.get(s.charAt(i)) == false) {
                    // set entry to true and update end pointer
                    map.put(s.charAt(i), true);
                    end = i;
                    charsFound++;
                    // If all chars have been found then keep track of the subarray size
                    if (charsFound == t.length() && end - start < min) {
                        min = end - start;
                        if(t.length() ==1)
                            start = end;
                        result = s.substring(start, end + 1);
                    }
                }
                // Char has been seen before
                else if (map.get(s.charAt(i)) == true) {
                    // System.out.println("seen: " + s.charAt(i));
                    // save location
                    end = i;
                    map.put(s.charAt(i), false);
                    // Reset flag of seen chars up until the new end
                    while (start < end) {
                        // System.out.println("start: " + s.charAt(start));
                        // 0 1 2 3 4 5 6 7 8 9 10 11 12
                        // A D O B E C O D E B A N C

                        // ignore the duplicate char found at the end
                        if (map.containsKey(s.charAt(start)) && s.charAt(end) != s.charAt(start)) {
                            // System.out.println("RESET: " + s.charAt(start));
                            charsFound--;
                            map.put(s.charAt(start), false);
                        }
                        start++;
                    }
                }
            } 
        }
        return result;
    }
}
