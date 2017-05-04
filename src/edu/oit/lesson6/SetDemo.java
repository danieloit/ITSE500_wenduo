package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.HashSet;


public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		HashSet<Animal> animals = new HashSet<>();
		ArrayList list1;
		set.add("Panda");
		set.add("Panda");
		set.add("Monkey");
		set.addAll(1);
		
		
		
		
		
		System.out.println(set.isEmpty());
		System.out.println(set.contains("Panda") );
		System.out.println(set.size());
		
		
	}

}
