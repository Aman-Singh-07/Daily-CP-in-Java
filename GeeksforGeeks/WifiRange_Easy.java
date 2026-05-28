// https://www.geeksforgeeks.org/problems/wifi-range--170647/1

class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(!s.substring(Math.max(0,i-x),Math.min(s.length(),i+x+1)).contains("1")) return false;
            }
        }return true;
    }
}
