package com.leetcode;

class LC3232_Solution1 {

    static boolean main(int[] nums) {
        
        int alice_sum=0;
        int bob_sum=0;

        for(int n:nums) {
            if(n<10) {
                alice_sum += n;
            } else {
                bob_sum += n;
            }
        }

        return (alice_sum>bob_sum) || (bob_sum>alice_sum);
    }

}

public class LC3232 {
    
    public static void main(String[] args) {

        // int[] nums = new int[]{1,2,3,4,10};
        int[] nums = new int[]{1,2,3,4,5,14};

        System.out.println(LC3232_Solution1.main(nums));
    }
    
    static boolean main(int[] nums) {
        return LC3232_Solution1.main(nums);
    }
}

class Solution {
    public boolean canAliceWin(int[] nums) {
        return LC3232.main(nums);        
    }
}