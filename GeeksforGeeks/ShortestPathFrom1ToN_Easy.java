// https://www.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1

class Solution {
    public int minimumStep(int n) {
        // code here
        int res=0;
        while(n!=1){
            if(n>=3){
                res+=n%3;
                res++;
                n/=3;
            }
            else{
                n--;
                res++;
            }
        }
        return res;
        
    }
}
