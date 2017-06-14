package edu.oit.extra;

import java.util.HashSet;
import java.util.Iterator;

public class Average {
    public static void main(String[]args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        int sum = 0;
        for (int i : set){
        	sum += i;
        }
      
        double average = (double)sum/(double)set.size();
        System.out.println(average);
        
    }
}