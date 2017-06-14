package edu.oit.missing.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CoinFlip {
	ArrayList<Boolean> list = new ArrayList<Boolean>();

	public void coinFlip(int k, char side) {
		boolean flip = (side == 'H') ? true: false;
		
		Random random = new Random();
		int count = 0;
		while (true) {
			boolean nextFlip = random.nextBoolean();
			list.add(nextFlip);
			if (nextFlip == flip)
				count++;
			else count = 0;
			
			if (count == k)
				break;
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			boolean temp = (boolean) it.next();
			if (temp == true)
				System.out.print("H ");
			else
				System.out.print("T ");

		}
		System.out.printf("\nYou got " + side + " " + k + "  times in a row!");

	}

	public static void main(String[] args) {
		CoinFlip myCoinFlip = new CoinFlip();
		myCoinFlip.coinFlip(4, 'H');

	}

}