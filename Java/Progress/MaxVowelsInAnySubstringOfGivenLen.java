package Progress;

//Submission: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/969874799/

public class MaxVowelsInAnySubstringOfGivenLen {

    public static int maxVowels(String s, int k) {
        // Declare a max vowel variable
        int maxVowels = 0;
        int currVowels = 0;

        // Counts vowels in the first substring
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                currVowels++;
        }
        // Update max if the current is bigger than the max
        maxVowels = Math.max(maxVowels, currVowels);

        // Iter through the rest of the str starting from the last element of 1st
        // substring
        for (int i = k; i < s.length(); i++) {
            if (maxVowels == k)
                return maxVowels;
            // Represents the first element of the substring
            // Subtract from count if it's a vowel since it has already been evaluated
            if (isVowel(s.charAt(i - k)))
                currVowels--;
            // Represents the last element of the substring
            // Add to counter if it's a vowel since it is a new element
            if (isVowel(s.charAt(i)))
                currVowels++;
            // Update max vowel count
            maxVowels = Math.max(maxVowels, currVowels);
        }

        // Return the max number after iteration
        return maxVowels;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
