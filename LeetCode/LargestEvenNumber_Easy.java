// https://leetcode.com/problems/largest-even-number/description/

class Solution {
    public String largestEven(String s) {
        int index=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                index=i;
                break;
            }
        }
        if(index!=-1){
            return s.substring(0,index+1);
        }
        else if(index==-1){
            return "";
        }
        return s;
    }
}
