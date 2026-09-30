// https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/?envType=daily-question&envId=2026-09-30

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res=new int[seq.length()];
        int count=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                count++;
                res[i]=count%2;
            }else{
                res[i]=count%2;
                count--;
            }
        }
        return res;
    }
}
