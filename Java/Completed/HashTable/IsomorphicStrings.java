package Completed.HashTable;
import java.util.HashMap;
import java.util.Map;

//Submission: https://leetcode.com/problems/isomorphic-strings/submissions/948112871/

class IsomorphicStrings {    
    public boolean isIsomorphic(String s, String t) {

        //create two maps
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        // check if the strings are empty
        if (s == "" || t == "") {
            return false;
        }

        // iterate through string
        for (int i = 0; i < s.length(); i++) {
            // if mapping of first string exists
            if (map1.containsKey(s.charAt(i))) {
                // giving the key (current char of "s")
                // check if the mapped value of that char equals
                // the current char in t
                if (map1.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }

            // same thing as before but now with the second map
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
                continue;
            }

            // map "s to t" and "t to s"
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));

        }
        return true;

    }

}