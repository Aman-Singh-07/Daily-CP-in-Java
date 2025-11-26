// https://www.geeksforgeeks.org/problems/and-operation5726/1

class Solution {
    public int andInRange(int l, int r) {
        int res=0;
        while(l<r){
            l>>=1; r>>=1; res++;
        }
        return l<<res;
    }
}
