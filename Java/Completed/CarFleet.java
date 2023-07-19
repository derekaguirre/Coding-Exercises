package Completed;

import java.util.Map;
import java.util.TreeMap;

//Submission: https://leetcode.com/problems/car-fleet/submissions/998839374/

public class CarFleet {
    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[] { 10, 8, 0, 5, 3 }, new int[] { 2, 4, 1, 1, 3 }));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> carMap = new TreeMap<>();
        // Make associations of cars' positions to speeds
        for (int i = 0; i < position.length; i++) {
            carMap.put(position[i], speed[i]);
        }

        // Find arrival time and store in array
        float[] etaArr = new float[position.length];
        int count = 0;
        for (int iter : carMap.keySet()) {
            etaArr[count] = (float) (target - iter) / carMap.get(iter);
            count++;
        }

        // Currently have an ETA arr, ordered by position.
        // Just need to traverse backwards and merge intervals
        int fleet = 1;
        float currEta = etaArr[etaArr.length - 1];
        for (int i = etaArr.length - 2; i >= 0; i--) {
            if (Float.compare(etaArr[i], currEta) > 0) {
                currEta = etaArr[i];
                fleet++;
            }
        }
        return fleet;
    }
}
