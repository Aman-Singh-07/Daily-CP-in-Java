// https://leetcode.com/problems/replace-non-coprime-numbers-in-array/description/?envType=daily-question&envId=2025-09-16

import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n; i++){
            int curr=nums[i];
            while(!list.isEmpty() && gcd(list.get(list.size()-1),curr) > 1){
                curr=lcm(list.remove(list.size()-1),curr);
            }
            list.add(curr);
        }
        
        return list;
    }

    public static int gcd(int a, int b){
        return b==0?a:gcd(b,a%b);
    }

    private int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
}
