// https://leetcode.com/problems/count-operations-to-obtain-zero/description/?envType=daily-question&envId=2025-11-09

class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1!=0 && num2!=0){
            if(num1<num2){
                num2-=num1;
            }
            else{
                num1-=num2;
            }
            count++;
        }
        return count;
    }
}
