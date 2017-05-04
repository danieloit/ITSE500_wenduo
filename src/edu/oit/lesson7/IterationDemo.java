package edu.oit.lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterationDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("San Francisco");
		set.add("San Diego");
		set.add("Sacramento");
		set.add("San Diego");
		set.add("San Jose");

		// 增强型for循环遍历
		for (String element : set) {
			System.out.println(element.substring(3));
		}
		// Iterator 迭代器遍历
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		Set<Integer> numSet = new HashSet<>();
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(5);
		numSet.add(1);
		numSet.add(0);
		for (Integer element : numSet) {
			System.out.println(element);
		}
		System.out.println(numSet.size());

		Integer[] nums = { 2, 3, 5, 1, 5 };
		List<Integer> list = Arrays.asList(nums);
		int max = 0;
		// 普通for循环
		for (int i = 0; i < list.size(); i++) {
			int element = (int) list.get(i);
			if (element > max) {
				max = element;
			}
		}
		System.out.println(max+ " is max");
		
		int min = (int) list.get(1);
		for (Integer element1 : list) {
			if (element1 < min) {
				min = element1;
			}
		}

		System.out.println(min + " is min");
		
		
		
		Iterator<Integer> i = list.iterator();
		int max1 =0;
		while(i.hasNext()){
			if(i.next()>max1)
			max1=i.next();
		}
		System.out.println("Iterator to see max is " + max1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
