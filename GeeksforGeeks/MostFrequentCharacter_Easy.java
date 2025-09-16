// https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] freq=new int[256]; 
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            freq[ch[i]]++;
        }
        int maxFreq=-1;
        char result=0;
        for(int i=0;i<256;i++){
            if (freq[i]>maxFreq){
                maxFreq=freq[i];
                result=(char) i;
            }
        }
        
        return result;
    }
}
