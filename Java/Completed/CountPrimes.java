package Completed;

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
}
