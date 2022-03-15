/* TwoSum.java
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        command line app
 */

package com.mmurray;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    /*  the solution to this problem is to use the appropriate data structure.
        We could use loops and iterate through, but the appropriate answer is to use a hashmap
        Because our array isn't sorted and we want the index, not the value we have to iterate
        through the whole list.
        Put the array into a hashmap then use the keyvalue in the hashmap for lookup.
        Easiest way is then iterate through the nums array, subtracting the index value from target - look in hashmap
        for remainder required.
     */

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if (sumMap.containsKey(complement)){
                return new int[]{ sumMap.get(complement), i};
            } else {
                sumMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

}