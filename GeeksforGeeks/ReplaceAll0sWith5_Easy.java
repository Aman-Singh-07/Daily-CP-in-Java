// https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&status=unsolved&sortBy=difficulty

class Solution {
    int convertfive(int num) {
        // Your code here
        StringBuilder sb=new StringBuilder();
        if(num==0) return 5;
        while(num>0){
            int r=num%10;
            if(r==0) sb.append(5);
            else sb.append(r);
            num/=10;
        }
        return Integer.valueOf(sb.reverse().toString());
    }
}
