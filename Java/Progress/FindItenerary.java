package Progress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindItenerary {
    public static void main(String[] args) {
        List<String> flight1 = new ArrayList<String>();
        List<String> flight2 = new ArrayList<String>();
        List<String> flight3 = new ArrayList<String>();
        flight1.add("MUC");
        flight1.add("LHR");
        flight2.add("SFO");
        flight2.add("SJC");
        flight3.add("LHR");
        flight3.add("SFO");
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(flight1);
        tickets.add(flight2);
        tickets.add(flight3);
        
        findItinerary(tickets);
    }
    public static List<String> findItinerary(List<List<String>> tickets) {

        Map<String,String> map = new HashMap<String,String>();

        for (int i = 0; i < tickets.size(); i++) {
            map.put(tickets.get(i).get(0), tickets.get(i).get(1));
        }
        return new ArrayList<>();
    }
}
