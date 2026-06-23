// https://www.geeksforgeeks.org/problems/killing-spree3020/1

class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        long num=p;
        long i=1;
        int count=0;
        while((num-i*i)>=0){
            count++;
            num-=i*i;
            i++;
        }
        return count;
        
    }
};
