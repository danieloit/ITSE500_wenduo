package edu.oit.extra;

import java.util.HashMap;

public class SecondSmallest {

	public SecondSmallest() {
		// TODO Auto-generated constructor stub
	}

static HashMap <String, Integer>map = new HashMap<>();

private static String getMax () {
    String minKey1 = null;
    String minKey2 = null;
    int minValue1 = Integer.MAX_VALUE;
    int minValue2 = Integer.MAX_VALUE;
    for (String key : map.keySet()) {
        int value = map.get(key);
        
        if (value < minValue1 && value < minValue2) {
            minValue2 = minValue1;
            minKey2 = minKey1;
        	minValue1 = value;
            minKey1 = key;
        };
        if (value < minValue2 && value > minValue1){
        	minValue2 = value;
        	minKey2 = key;
        }
       
    }
    return minKey2;
}

public static void main (String[] args) {
    map.put("a", 2);
    map.put("b", 4);
    map.put("c", 6);
    map.put("d", 8);
    map.put("e", 1);
    map.put("f", 3);
    map.put("g", 5);
    map.put("h", 7);
    System.out.println(getMax());
}
	
	
	
}
