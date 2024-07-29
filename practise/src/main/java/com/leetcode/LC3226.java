package com.leetcode;

class LC3226_Solution1 {

    static int recurr(int n, int k) {
        
        if(n==0 && k==0) {
            return 0;
        }

        int curr_n = n&1;
        int curr_k = k&1;

        int new_n = n>>1;
        int new_k = k>>1;

        if(curr_n==0 && curr_k==0) {
            return 0 + recurr(new_n, new_k);
        }

        if(curr_n==0 && curr_k==1) {
            return -10000000;
        }

        return 1 + recurr(new_n, new_k);
    }

    static int main(int n, int k) {

        int ans =LC3226_Solution1.recurr(n, k);

        if(ans<0) return -1;
        return ans;

    }
}

public class LC3226 {

    public static void main(String[] args) {
        
        int n=13, k=4;
        System.out.println(LC3226_Solution1.main(n,k));

    }
    static int minChanges(int n, int k) {
        return LC3226_Solution1.main(n,k);
    }
    
}

class Solution {
    public int minChanges(int n, int k) {
        return LC3226.minChanges(n,k);
    }
}