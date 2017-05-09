package edu.oit.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchPairs {

	public static void main(String[] args) {

		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("bb", "a", "ddd", "c", "ee", "f", "g"));
		List<String> array2 = new ArrayList<>();
		array2 = switchPairs(array1);
		for (int i = 0; i < array2.size(); i++) {
			System.out.print(array2.get(i) + " ");
		}

	}

	public static List<String> switchPairs(List<String> array) {
		List<String> arrayResult = new ArrayList<>();
		int len = (array.size() % 2 == 0) ? array.size() / 2 : (array.size() - 1) / 2;
		for (int i = 0; i < len; i++) {
			arrayResult.add(array.get(2 * i + 1));
			arrayResult.add(array.get(2 * i));

		}
		if (array.size() % 2 == 1)
			arrayResult.add(array.get(len * 2));

		return arrayResult;
	}

}
