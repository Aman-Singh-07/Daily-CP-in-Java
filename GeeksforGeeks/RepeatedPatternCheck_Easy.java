// https://www.geeksforgeeks.org/problems/the-pattern-matcher/1

class Solution {
    public boolean findPattern(String s) {
        // code here
        int count=0;
        boolean isTrue=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='x'){
                if(!isTrue && count!=0) return false;
                count++;
            }
            else{
                if(count>0) count--;
                else return false;
                isTrue=false;
            }
            if(count==0) isTrue=true;
        }
        return count==0;
    }
}
