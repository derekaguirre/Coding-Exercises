package Completed.Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Submission: https://leetcode.com/problems/time-based-key-value-store/submissions/1012473528/

class Data {
    String val;
    int time;
    Data(String val, int time) {
        this.val = val;
        this.time = time;
    }
}

public class TimeMap {
    Map<String, List<Data>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key))
            map.put(key, new ArrayList<Data>());
        map.get(key).add(new Data(value, timestamp));
    }

    // Binary Search implementation
    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";
        return binarySearch(map.get(key), timestamp);
    }

    public String binarySearch(List<Data> data, int timestamp) {
        int low = 0, high = data.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (data.get(mid).time == timestamp)
                return data.get(mid).val;
            if (timestamp < data.get(mid).time)
                high = mid - 1;
            else {
                if (data.get(mid + 1).time > timestamp)
                    return data.get(mid).val;
                low = mid + 1;
            }
        }
        return data.get(low).time <= timestamp ? data.get(low).val : "";
    }
}
