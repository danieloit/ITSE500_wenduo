package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class List {

	public static void main(String[] args) {
		int[] l = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
		System.out.println("the size of the list is "+numUniqueValues(l));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(8, 9, 10));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(6, 5, 4, 3, 2, 1));
        System.out.println("The new list is ");
        for (int i=0; i<list1.size() +list2.size(); i++){
        System.out.print( alternate(list1,list2).get(i)+", ");
		}
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Alyssa", 22);
        map.put("Char", 25);
        map.put("Dan", 25);
        map.put("Jeff", 20);
        map.put("Kasey", 20);
        map.put("Kim", 20);
        map.put("Mogran", 25);
        map.put("Ryan", 25);
        map.put("Stef", 22);
        System.out.println("the least common value is " + leastCommon(map));
        
        
        
        
        
        
        
	}
	
		
		public static int numUniqueValues( int[] List ){
			LinkedList list = new LinkedList();
			for (int i = 0; i<List.length; i++) {
	            if (!list.contains(List[i])) {
	                list.add(List[i]);
	            }
	        }
			
			return list.size();
		}
		
		
		public static ArrayList<Integer> alternate( ArrayList<Integer> list1, ArrayList<Integer> list2 ){
			ArrayList<Integer> combinedList = new ArrayList<Integer>();
			ArrayList<Integer> sortedList = new ArrayList<Integer>();
			if (list1.size() < list2.size()){
				combinedList.addAll(list1);
				combinedList.addAll(list2);
				sortedList = combinedList;
				for(int i=0;i<list1.size();i++){
					sortedList.set(2*i,list1.get(i));
					sortedList.set(2*i+1,list2.get(i));
				}
				
			}
			else{
				combinedList.addAll(list2);
				combinedList.addAll(list1);
				sortedList = combinedList;
				for(int i=0;i<list2.size();i++){
					sortedList.set(2*i,list1.get(i));
					sortedList.set(2*i+1,list2.get(i));
				}
				
			}
			

			return sortedList;
		}
		
		
		public static int leastCommon(HashMap<String, Integer> args) {
	        String leastKey=null;
	        HashMap<String, Integer> map = new HashMap<String, Integer>();

	        
	        
	        for (String key : args.keySet()) {
	            int value1 = args.get(key);
	            int count = 1;
	            Iterator<Entry<String, Integer>> it = args.entrySet().iterator();  
		        while (it.hasNext()) {  
		         Map.Entry<String, Integer> entry = it.next();  
		         
		         if(entry.getValue()==value1){
		        	 count++;
		         } 
		        }  
	            map.put(key, count);
	        }

	        
	        int countMin = Collections.min(map.values());
	        for (String key : map.keySet()) {
	            if (map.get(key) == countMin) {
	                leastKey = key;
	            }
	        }

	        return args.get(leastKey);
	    }
		
			
		
		
	
		

}

