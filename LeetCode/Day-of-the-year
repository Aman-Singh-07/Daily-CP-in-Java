// https://leetcode.com/problems/day-of-the-year/description/

class Solution {
    public int dayOfYear(String date) {
        int[] arr={0,31,59,90,120,151,181,212,243,273,304,334};
        int day=Integer.valueOf(date.substring(8));
        int month=Integer.valueOf(date.substring(5,7));
        int year=Integer.valueOf(date.substring(0,4));
        if((year%4==0 && year%100!=0) || year%400==0){
            if((month>2)){
                day=day+1;
            }
        }
        return arr[month-1]+day;
    }
}
