package Completed.Math;

import java.util.*;

//Submission: https://leetcode.com/submissions/detail/902119047/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<String>();
        for(int i=0; i <= n; i++){
            if(i == 0)
                continue;
            if(i % 3 == 0 && i % 5 == 0)
                resultList.add("FizzBuzz");
            else if(i % 3 == 0)
                resultList.add("Fizz");
            else if(i % 5 == 0)
                resultList.add("Buzz");
            else
                // resultList.add(String.valueOf(i));
                resultList.add(Integer.toString(i));   
        }
        return resultList;
        
    }
}