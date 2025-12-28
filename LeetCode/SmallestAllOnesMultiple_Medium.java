// https://leetcode.com/problems/smallest-all-ones-multiple/

class Solution {
    public int minAllOneMultiple(int k) {
        if(k%2==0 || k%5==0) return -1;
        int res=1;
        StringBuilder sb=new StringBuilder();
        int rem=1%k;
        while(rem!=0){
            sb.append("1");
            rem=(rem*10+1)%k;
            res++;
            if(res>k) return -1;
        }
        return res;
    }
}
