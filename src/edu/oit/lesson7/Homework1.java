package edu.oit.lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) {
		Integer[] s = { 3, 17, -1, 4, 9, 2, 14 };
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(s));
        Set<Integer> set2 = removeRange(set1, 1, 10);

        for (Integer element : set2) {
			System.out.print(element+" ");
		}
		
		
		
	}

public static Set<Integer> removeRange (Set <Integer> setOfInt,int minimum,int maximum){
	
	Set<Integer> resultSet = new HashSet<>();
	for (Integer index1 : setOfInt) {
		
		if (index1 < minimum || index1 > maximum){
//			setOfInt.remove(index1);
			resultSet.add(index1);
		};
		
	}
	
	return resultSet;
}
	
	
	
	
	
}
