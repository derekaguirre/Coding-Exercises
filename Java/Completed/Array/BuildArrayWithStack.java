package Completed.Array;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/problems/build-an-array-with-stack-operations/submissions/1090401253/

public class BuildArrayWithStack {
    public static void main(String[] args) {
        buildArray(new int[] { 1, 3 }, 3);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int stream = 1;
        // Check every value in target with stream
        for (int i = 0; i < target.length; i++) {
            // For cases where the target's value and stream number aren't the same
            while (stream < target[i]) {
                // Add the "push" and the "pop" to simulate stack moving forward through stream
                list.add("Push");
                list.add("Pop");
                stream++;
            }
            // Otherwise the current number matches and only needs a "push"
            list.add("Push");
            stream++;

        }

        return list;
    }
}
