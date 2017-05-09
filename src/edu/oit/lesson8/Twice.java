package edu.oit.lesson8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Twice {
	
	public static void main(String[] args) {
		
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("how", "are", "you?"));
		List<String> array2 = new ArrayList<>();
		array2 = twice(array1);
	    for (int i=0; i<array2.size(); i++) {
			System.out.print(array2.get(i)+" ");
		}
		
		
		
	}
	

	
	
	public static List<String> twice(List<String> array){
		int len = array.size();
		
		for ( int i=0;i<len; i++){
			
			array.add(array.get(i));
			
		}
		
		return array;
	};
	
	
}
