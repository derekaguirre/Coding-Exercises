package Completed;

//Submission: https://leetcode.com/submissions/detail/938770562/

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        
        while(n%3 == 0){
            n/=3;
            if(n == 1)
                return true;     
        }
        
        return n == 1;
    }
}