package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		ArrayList list1;
		
		
		
		set.add("Panda");
		set.add("Monkey");
		set.add("Monkey");
		set.remove("Panda");
		System.out.println(set.isEmpty());
		System.out.println(set.contains("Panda") );
		System.out.println(set.size());
		
		
	}

}
