package Progress;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    //Convert to charArray and then sort
    public boolean canConstruct(String ransomNote, String magazine) {
        // Loop through
        Map<Character, Character> map = new HashMap<>();

        int noteIter = 0;
        
        for (int mIter = 0; mIter < magazine.length(); mIter++) {
            // if chars are not the same, move magazine pointer until char is found
            if (magazine.charAt(mIter) != ransomNote.charAt(noteIter)){
                noteIter++;
            }
            // otherwise the characters match and can be mapped
            else {
                // if mapping exists, skip
                if (map.containsValue(magazine.charAt(noteIter))){
                    map.getOrDefault(map, null);
                }
                if (map.containsKey(magazine.charAt(noteIter))) {
                    noteIter++;
                    continue;
                }
                // If mapping does not exist, add it to the map
                else {
                    map.put(magazine.charAt(mIter), ransomNote.charAt(mIter));
                }
            }

        }
        return false;
    }
}
