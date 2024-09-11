package Completed.TwoPointers;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int candyTypes[] = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyTypes));
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> uniques = new HashSet<Integer>();
        for(int i = 0; i<candyType.length; i++){
            uniques.add(candyType[i]);
        }
        return Math.min(candyType.length/2, uniques.size());
    }
}
