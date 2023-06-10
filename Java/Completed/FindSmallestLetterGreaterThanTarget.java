package Completed;

//Submission O(n): https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/967682135/
//Submission O(Log(n)): https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/967791210/

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

        System.out.println(nextGreatestLetterBSearch(arr, 'c'));
    }

    // Naive Solution O(n)
    public char nextGreatestLetter(char[] letters, char target) {
        // Iterate through the list since it's already sorted
        for (int i = 0; i < letters.length; i++) {
            // Return letter bigger than target
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    // Faster Solution O(Log(n))
    public static char nextGreatestLetterBSearch(char[] letters, char target) {
        int low = 0, high = letters.length-1;

        while (low <= high) {
            int mid = low +(high - low) / 2;
            
            if (letters[mid] > target) {
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return letters[low % letters.length];
    }
}
