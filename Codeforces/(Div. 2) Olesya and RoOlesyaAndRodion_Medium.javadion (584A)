// https://codeforces.com/problemset/problem/584/A

import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t=input.nextInt();
        BigInteger base=BigInteger.TEN.pow(n-1);
        BigInteger x=BigInteger.valueOf(t);
        BigInteger res=base.add(x).subtract(BigInteger.ONE).divide(x).multiply(x);
       
        if(res.compareTo(BigInteger.TEN.pow(n))<0) System.out.println(res);
        else System.out.println(-1);
        
    }
}
