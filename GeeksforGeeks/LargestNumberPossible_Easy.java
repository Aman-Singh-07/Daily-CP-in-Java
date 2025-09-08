// https://www.geeksforgeeks.org/problems/largest-number-possible5028/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    static String findLargest(int n,int s){
        if(s==0){
            return (n==1)?"0":"-1";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s>=9){
                sb.append('9');
                s-=9;
            }else{
                sb.append((char)('0'+s));
                s=0;
            }
        }
        if (s>0) return "-1";

        return sb.toString();
    }
}
