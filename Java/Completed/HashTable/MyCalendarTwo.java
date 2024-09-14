package Completed.HashTable;

import java.util.Map;
import java.util.TreeMap;

// Submission: https://leetcode.com/problems/my-calendar-ii/submissions/1389310022

public class MyCalendarTwo {
    private Map<Integer,Integer> map;
    public MyCalendarTwo() {
        map = new TreeMap<Integer,Integer>();
    }
    
    public boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0)+1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int sum = 0;
        
        for(int curr : map.values()){
            sum += curr;
            //if triple booked remove the booking
            if(sum >= 3){
                map.put(start, map.get(start) - 1);
                map.put(end, map.get(end) + 1);
                if(map.get(start) == 0)
                    map.remove(start);
                return false;
            }
        }
        return true;
    }
}
