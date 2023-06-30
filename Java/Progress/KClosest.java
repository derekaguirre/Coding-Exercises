package Progress;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//Problem: https://leetcode.com/problems/k-closest-points-to-origin/description/

public class KClosest {
    public static void main(String[] args) {
        // int[][] points = { { 1, 3 }, { -2, 2 } };
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        // int[][] points = { { 0, 1 }, { 1, 0 } };
        kClosestMax(points, 2);

        
    }
    
    public static int[][] kClosestMax(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1] - (a[0] * a[0] + a[1] * a[1])));
        
        for (int[] point : points) {
            maxHeap.add(point);
            
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[k][2];
        while (k-- > 0) {
            result[k] = maxHeap.poll();
        }
        
        return result;
    }

    public static int[][] kClosestSort(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> euclideanDistance(p1) - euclideanDistance(p2));
        return Arrays.copyOfRange(points,0,k);
    }
    
//     public static int[][] kClosestPrioQ(int[][] points, int k){
//         final PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
//             Comparator.comparing(this::euclideanDistance)
//         );

//         for(int[] point: points){
//             priorityQueue.offer(point);
//         }

//         final int[][] result = new int[k][2];
//         for (int i = 0; i < result.length; i++) {
//             result[i] = priorityQueue.poll();
//         }
//         return result;
//     }
    private static int euclideanDistance(int[] point){
        return point[0] * point[0] + point[1] + point[1];
    }
}
