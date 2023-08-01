package Completed.Design;

public class TimeBasedKeyValueStore {
    private String key;
    private String value;
    private int timestamp;

    public TimeBasedKeyValueStore() {
    }

    public void set(String keyIn, String valueIn, int timestampIn) {
        this.key = keyIn;
        this.value = valueIn;
        this.timestamp = timestampIn;
    }

    //Binary Search implementation
    public String get(String key, int timestamp) {
        return "";
    }


    /**
     * Your TimeMap object will be instantiated and called as such:
     * TimeMap obj = new TimeMap();
     * obj.set(key,value,timestamp);
     * String param_2 = obj.get(key,timestamp);
     */
}
