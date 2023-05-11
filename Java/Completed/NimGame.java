package Completed;

//Submission: https://leetcode.com/submissions/detail/937623795/

public class NimGame {
    public boolean canWinNim(int n) {
        if (n <= 3)
            return true;
        else if (n % 4 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
