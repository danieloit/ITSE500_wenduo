package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.addFirst("two");
		System.out.println(linkedList.get(0));
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("Spring");
		arrayList.add("Autumn");
		arrayList.set(1,"summer");
		arrayList.set(1, null);
		System.out.println(arrayList.toString());
		System.out.println(arrayList.get(1));
	}

}
