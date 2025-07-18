// https://www.geeksforgeeks.org/problems/lcm-triplet1501/1

class Solution {
    int lcmTriplets(int n) {
        // code here
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 6;
        if(n%2!=0){
            return n*(n-1)*(n-2);
        }else{
            if(n%3==0){
                return (n-1)*(n-2)*(n-3);
            }else{
                return n*(n-1)*(n-3);
            }
        }
    }
}
