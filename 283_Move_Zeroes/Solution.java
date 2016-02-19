package com.test;

public class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        
        for(int i = length - 1; i >= 0; i--){
            int j = nums[i];
            
            if((j == 0) && (i != length - 1)) {
                int k = i;
                while(true){
                    nums[k] = nums[k + 1];
                    k++;
                    if((k + 1) == length) break;
                }
                nums[length - 1] = 0;
            } else {
                ;
            }
        }
    }
}

