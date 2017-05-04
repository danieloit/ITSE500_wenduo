package edu.oit.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class MapIterationDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("John", 88);
		map.put("Lily", 90);
		map.put("Lucy", 92);
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " got " + entry.getValue());
		}
		
		int max = 0;
		for(int value:map.values()){
			if(value>max){
			max = value;
			}
			
		}
		
		System.out.println("The max grade is " + max);
		
		
		for(String name: map.keySet()){
			System.out.println(name);
		}
		
		
		int max2 = 0;
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getKey());

		}
		
		Iterator<Integer> iterator2 = map.values().iterator();
		while(iterator2.hasNext()){
			System.out.println("Hello"+iterator2.next());

		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
