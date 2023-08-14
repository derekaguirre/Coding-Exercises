package Progress;

import java.util.LinkedList;
import java.util.List;

//Submission: https://leetcode.com/problems/add-to-array-form-of-integer/submissions/1020736450/

public class AddToArrayForm {
    public static void main(String[] args) {
        addToArrayForm(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 }, 1);
    }

    public static List<Integer> addToArrayForm(int[] num ,int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i){
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
