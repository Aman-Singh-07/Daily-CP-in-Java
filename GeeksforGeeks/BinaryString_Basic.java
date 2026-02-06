//  https://www.geeksforgeeks.org/problems/binary-string-1587115620/1

class Solution {
    public int binarySubstring(String s) {
        // code here
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count*(count-1)/2;
    }
}
