// https://www.geeksforgeeks.org/problems/lemonade-change/1

class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int count5=0;
        int count10=0;
        for(int num:arr){
            if(num==5) count5++;
            if(num==10){
                if(count5!=0){
                    count5--;
                    count10++;
                }else return false;
            }
            if(num==20){
                if(count10!=0 && count5!=0){
                    count10--;
                    count5--;
                }
                else if(count5>2){
                    count5-=3;
                }
                else return false;
                
            }
        }
        return true;
    }
}
