//  https://leetcode.com/problems/minimum-penalty-for-a-shop/description/?envType=daily-question&envId=2025-12-26

class Solution {
    public int bestClosingTime(String customers) {
        int index=0;
        int sum=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') sum++;
        }
        int min=sum;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') sum--;
            else sum++;
            if(sum<min){
                min=sum;
                index=i+1;
            }
        }
        return index;

    }
}
