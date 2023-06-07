package Completed;

import java.util.Arrays;

class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        //Evaluate a difference from the first two elements
        int diff = arr[1] - arr[0];

        //Match with the rest of the elements
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != diff) {
                return false;
            }
        }

        return true;
    }
}