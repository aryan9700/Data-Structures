package hashingQuestions;

import java.util.HashMap;

public class itinerary {

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Benglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (! revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}