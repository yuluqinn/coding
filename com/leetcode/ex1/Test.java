package com.leetcode.ex1;
import java.util.HashMap;
public class Test{
    private int[] twoSum1(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
    private int[] twoSum2(int[] nums, int target){
        for(int i=0; i<nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static void main(String args[]){
        Test test = new Test();
        int[] input = {1, 4, 5, 2, 9};
        int target = 7;
        System.out.println(test.twoSum1(input, target)[1]);
        System.out.println(test.twoSum2(input, target)[1]);
    }

}