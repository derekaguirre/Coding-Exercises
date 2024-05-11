package Completed.Math;

//Submission: https://leetcode.com/submissions/detail/757701710/

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primeList = new boolean[n]; // instantiate list
        for (int i = 2; i < n; i++) { // populate with all trues
            primeList[i] = true;
        }
        for (int i = 2; i * i < n; i++) { // mark off all evens
            if (!primeList[i])
                continue;
            for (int j = i * i; j < n; j += i) { // mark off all multiples of the evens
                primeList[j] = false;
            }
        }
        int count = 0; // start counter
        for (int i = 2; i < n; i++) { // count all instances of trues
            if (primeList[i])
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(36));

    }

    public static boolean isPrime(int n) {
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <=sqrt; i++) {
            int tmp = n%i;
            if (tmp == 0)
                return false;
        }
        return true;
    }



    public static boolean isPrime2(int n) {
        
        //Constrained by N so it will run through all numbers until N
        for (int i = 1; i <= n; i++) {
            //
            if (i != 1 && i != n && n%i==0)
                return false;
        }
        return true;
    }


    //Time O(n) where n represents all numbers from 1 through n inclusive
    //Space O(1)
    //The loop starts at 1 and gets skipped by the condition which is unnecessary, it could have started at instead.
    //It iterates through every number until reaching n. Can get very expensive to compute depending on the number supplied.
    //The modulo operations performed are performed for every number until all conditions are true which wastes computational resources.
    public static boolean isPrime3(int n) {
        for (int i = 1; i <= n; i++) {
            if (i != 1 && i != n && n%i==0)
                return false;
        }
        return true;
    }

    
}
