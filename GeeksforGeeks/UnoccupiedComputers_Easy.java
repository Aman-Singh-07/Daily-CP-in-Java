// https://www.geeksforgeeks.org/problems/unoccupied-computers-1646661078/1

class Solution {
    public int solve(int n, String s) {
        // code here
        int count=0;
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            if(freq[ch-'A']==0){
                if(n==0){
                    freq[ch-'A']--;
                    count++;
                }
                else{
                    freq[ch-'A']++;
                    n--;
                }
            }else if(freq[ch-'A']==1){
                freq[ch-'A']--;
                n++;
            }
        }
        return count;
    }
}
