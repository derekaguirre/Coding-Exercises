package Completed.TwoPointers.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        minWindow(s,t);
    }
    public static String minWindow(String s, String t) {
        int[] charProps = new int[2];
        Map<Character, int[]> entireMap = new HashMap<>();

        //AA
        for (int i = 0; i < t.length(); i++) {
            //Push t chars to maps
            if(!entireMap.containsKey(t.charAt(i))){
                charProps[0] = 0;
                charProps[1] = i;

                entireMap.put(t.charAt(i), charProps);
            }
        }


        return "";
    }
}
