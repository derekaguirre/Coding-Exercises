package Completed.Array;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

//Submission: https://leetcode.com/problems/find-the-difference-of-two-arrays/submissions/962747216/

public class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Instantiate lists
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> answerList = new ArrayList<>();
        answerList.add(new ArrayList<>());
        answerList.add(new ArrayList<>());

        // Add the arrays to sets
        for (int iter : nums1) {
            set1.add(iter);
        }
        for (int iter : nums2) {
            set2.add(iter);
        }
        // If set 1 is missing a number from set 2, add to answer
        for (int iter : set1) {
            if (!set2.contains(iter)) {
                answerList.get(0).add(iter);
            }
        }
        // If set 2 is missing a number from set 1, add to answer
        for (int iter : set2) {
            if (!set1.contains(iter))
                answerList.get(1).add(iter);
        }
        return answerList;
    }
}
