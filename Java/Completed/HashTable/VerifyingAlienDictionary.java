package Completed.HashTable;

import java.util.HashMap;
import java.util.Map;

//Submission: https://leetcode.com/problems/verifying-an-alien-dictionary/submissions/1097544310/

public class VerifyingAlienDictionary {
    public static void main(String[] args) {
        String[] words = { "hello", "leetcode" };
        String order = "qwertyuiopasdfghjklzxcvbnm";

        isAlienSorted(words, order);
    }

    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // Add every character -> number order to the map
        for (int i = 0; i < order.length(); i++)
            map.put(order.charAt(i), i);
        // Loop through words
        for (int i = 1; i < words.length; i++) {
            String str1 = words[i - 1], str2 = words[i];
            for (int j = 0; j < str1.length(); j++) {
                if (j == str2.length())
                    return false;
                char achar = str1.charAt(j), bchar = str2.charAt(j);
                if (map.get(achar) < map.get(bchar))
                    break;
                if (map.get(achar) > map.get(bchar))
                    return false;
            }
        }
        return true;
    }
}
