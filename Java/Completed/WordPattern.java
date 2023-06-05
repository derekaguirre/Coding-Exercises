package Completed;

import java.util.Map;
import java.util.HashMap;

//Submission: https://leetcode.com/problems/word-pattern/submissions/956139906/

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        // check if the strings are empty
        if (s == "" || pattern == "") {
            return false;
        }

        // Parse the string and separate them by spaces
        String parsedString = s;
        String[] tokens = parsedString.split(" ");
        if (pattern.length() != tokens.length) {
            return false;
        }
        // Map the pattern to a parsed string if it does not already exist
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < tokens.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                // Otherwise if it does exist just check to see if it matches with what we
                // already have
                if (!map.get(pattern.charAt(i)).equals(tokens[i]))
                    return false;
            }
            // If the value already exists, it's false
            if (map.containsValue(tokens[i]) && !map.containsKey(pattern.charAt(i))) {
                return false;
            } else {
                map.put(pattern.charAt(i), tokens[i]);
            }
        }

        return true;
    }
}
