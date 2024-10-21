package Completed.Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

//Submission: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/submissions/1429802153

public class MaxEvents {

    public int maxEvents(int[][] events){
        //Sort events by starting day
        Arrays.sort(events, (a,b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Iter through all the days
        int i = 0, count = 0, n = events.length;

        //Add all events that start on this day to the heap
        for(int day = 1; day <= 100000; day++){
            while(i < n && events[i][0] == day){
                minHeap.add(events[i][1]);
                i++;
            }

            // Remove the events that already ended
            while(!minHeap.isEmpty() && minHeap.peek() < day){
                minHeap.poll();
            }

            //Attend the event that ends the earliest (top of heap)
            if(!minHeap.isEmpty()){
                minHeap.poll(); //attend
                count++; //iter count of attended events
            }
        }
        return count;
    }
}
