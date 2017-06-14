package edu.oit.extra;

import java.util.ArrayList;
import java.util.List;

public class NoLong {

	public static void main(String[] args) {
		String[] sl = { "hi", "hello", "hey", "ohman", "yoloo", "hello" };
		System.out.println(noLong(sl));

	}

	public static List noLong(String[] s) {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < 4)
				list.add(s[i]);
		}

		return list;
	}
}
