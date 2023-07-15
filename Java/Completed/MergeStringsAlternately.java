package Completed;

//Submission: https://leetcode.com/problems/merge-strings-alternately/submissions/969891141/

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int word1Pointer = 0, word2Pointer = 0;
        int mergedPosition = 0;
        char[] mergedWords = new char[word1.length() + word2.length()];

        while (word1Pointer < word1.length() || word2Pointer < word2.length()) {
            // If only the one of the words is not at end then add it to the merged list and
            // move forward
            if (word1Pointer < word1.length() && word2Pointer >= word2.length()) {
                mergedWords[mergedPosition] = word1.charAt(word1Pointer);
                word1Pointer++;
                mergedPosition++;
            } else if (word2Pointer < word2.length() && word1Pointer >= word1.length()) {
                mergedWords[mergedPosition] = word2.charAt(word2Pointer);
                word2Pointer++;
                mergedPosition++;
            }
            if (word1Pointer < word1.length() && word2Pointer < word2.length()) {
                // Add both letters to merged list until one or both runs out of chars
                mergedWords[mergedPosition] = word1.charAt(word1Pointer);
                word1Pointer++;
                mergedPosition++;

                mergedWords[mergedPosition] = word2.charAt(word2Pointer);
                word2Pointer++;
                mergedPosition++;
            }

        }

        return new String(mergedWords);
    }
}
