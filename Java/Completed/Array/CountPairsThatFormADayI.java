package Completed.Array;

//Submission: https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/submissions/1593742169

public class CountPairsThatFormADayI {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
