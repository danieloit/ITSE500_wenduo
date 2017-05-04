package edu.oit.lesson6;

import java.util.HashMap;
import java.util.function.Function;

public class MapDemo {

	

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();  //Integer 包装类
		hashMap.put("spring", 1);
		hashMap.put("summer", 2);
		hashMap.put("winter", 4);
		hashMap.put("summer", 2);
		hashMap.put("spring", 4);
		Double d = new Double(0.2d);//double
        Float f;//float
        Character c;//char
		
		Boolean b = new Boolean(true);
		boolean flag = b.booleanValue();   //拆箱
		int i = 1;
		Integer integer = new Integer(i);  //装箱
		
		
		System.out.println(hashMap.get("spring"));
		System.out.println(hashMap.size());
		System.out.println(hashMap.hashCode());
		
	}

}


