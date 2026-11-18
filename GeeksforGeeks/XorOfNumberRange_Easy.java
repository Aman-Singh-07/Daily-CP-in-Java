// https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1

class Solution {
    public int findXOR(int l, int r) {
        // code here
        return find(l-1)^find(r);
    }
    public int find(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return n;
    }
}
