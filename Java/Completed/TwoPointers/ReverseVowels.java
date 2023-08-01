package Completed.TwoPointers;

//Submission: https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/966379024/

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int frontPointer = 0, backPointer = charArr.length - 1;

        while (frontPointer < backPointer) {
            boolean frontFlag = false, backFlag = false;

            // Increment separately, set flag if the current char is vowel
            if (isVowel(charArr[frontPointer]))
                frontFlag = true;
            else
                frontPointer++;

            if (isVowel(charArr[backPointer]))
                backFlag = true;
            else
                backPointer--;

            // If both flags are true then swap chars, reset flags, and move both pointers
            if (frontFlag && backFlag) {
                char tmp = charArr[frontPointer];
                charArr[frontPointer] = charArr[backPointer];
                charArr[backPointer] = tmp;

                frontFlag = false;
                backFlag = false;

                frontPointer++;
                backPointer--;
            }

        }
        return new String(charArr);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
