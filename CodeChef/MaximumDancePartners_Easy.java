// https://www.codechef.com/problems/MADNER

class Solution {
    public int findMaximumPairs(String s) {
        // write your code here 
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='x' && s.charAt(i+1)=='y'){
                count++;
                i++;
            }
            else if(s.charAt(i)=='y' && s.charAt(i+1)=='x'){
                count++;
                i++;
            }
            
        }
        return count;
    }
}
