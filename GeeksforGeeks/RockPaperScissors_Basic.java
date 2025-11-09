// https://www.geeksforgeeks.org/problems/rock-paper-scissors2830/1?page=10&status=unsolved&sortBy=difficulty

// User function Template for Java

class Solution {
    String gameResult(String s) {
        // your code here
        if(s.charAt(0)==s.charAt(1)) return "DRAW";
        else if((s.charAt(0)=='R' && s.charAt(1)=='S') || (s.charAt(0)=='S' && s.charAt(1)=='P') || (s.charAt(0)=='P' && s.charAt(1)=='R')){
            return "A";
        }
        else return "B";
    }
}
