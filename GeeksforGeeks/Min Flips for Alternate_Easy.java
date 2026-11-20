// https://www.geeksforgeeks.org/problems/min-number-of-flips3210/1

class Solution {
    public int minFlips(String s) {
        // code here
        int count1=0;
        int count0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(i%2==0?'0':'1')) count1++;
            if(s.charAt(i)!=(i%2==0?'1':'0')) count0++;
        }
        return Math.min(count1,count0);
    }
}
