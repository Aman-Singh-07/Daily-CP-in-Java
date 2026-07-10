// https://www.geeksforgeeks.org/problems/count-of-sum-of-consecutives3741/1

class Solution {
    public int getCount(int n) {
        // code here
        int count=0;
        for(int k=2;(k*(k-1))/2<n;k++){
            int remainingNumerator=n-(k*(k-1))/2;
            if(remainingNumerator%k==0){
                count++;
            }
        }
        return count;
        
    }
}
