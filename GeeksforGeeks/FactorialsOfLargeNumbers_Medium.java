// https://www.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1?page=6&status=unsolved&sortBy=submissions

import java.util.*;
import java.math.BigInteger;
class Solution {
    public static ArrayList<Integer> factorial(int n) {
        BigInteger[] arr=new BigInteger[n + 1];
        arr[0]=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            arr[i]=arr[i-1].multiply(BigInteger.valueOf(i));
        }
        BigInteger num=arr[n];
        ArrayList<Integer> list=new ArrayList<>();
        while (num.compareTo(BigInteger.ZERO)>0){
            BigInteger[] divMod=num.divideAndRemainder(BigInteger.TEN);
            list.add(divMod[1].intValue());
            num=divMod[0];
        }
        Collections.reverse(list);
        return list;
    }
}
