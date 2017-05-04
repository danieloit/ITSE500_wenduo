package edu.oit.lesson6;

import java.util.HashMap;
import java.util.Map;

public class leetcode {

	
	public int[] twoSum(int[] nums, int sum) {

        int[] twoNum = new int[2];
        int len = nums.length;    
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int temp = 0;
        for(int i = 0; i < len; i++){
        	
            temp = sum - nums[i];
            if(map.containsKey(temp)){
                twoNum[0] = map.get(temp)+1;
                twoNum[1] = i+1;
                return twoNum;
            }else{
                map.put(nums[i], i);
            }
        }
        return twoNum;
    }
	
	
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest){
		int pigs = 1;
		while (Math.log(minutesToTest / minutesToDie + 1) * pigs < Math.log(buckets)){
			  pigs ++;}
			   return pigs;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
