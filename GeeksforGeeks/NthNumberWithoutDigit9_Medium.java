//https://www.geeksforgeeks.org/problems/nth-natural-number/1

import java.math.BigInteger;
class Solution {
    public String findNth(String n) {
        // code here
        BigInteger num=new BigInteger(n);
        return num.toString(9);
        
    }
}
