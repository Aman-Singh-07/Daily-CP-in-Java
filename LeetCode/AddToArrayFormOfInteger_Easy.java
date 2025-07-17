// https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length;i++){
            sb.append(String.valueOf(num[i]));
        }
        BigInteger resNum=new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
        ArrayList<Integer> l=new ArrayList<>();
        String str=resNum.toString();
        for(char c : str.toCharArray()){
            l.add(c-'0');
        }
        return l;
    }
}
