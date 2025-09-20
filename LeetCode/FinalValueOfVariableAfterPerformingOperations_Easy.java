// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(String s:operations){
            if(s.equals("++X") || s.equals("X++")) num++;
            else num--;
        }
        return num;
    }
}
