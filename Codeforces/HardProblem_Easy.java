// https://codeforces.com/problemset/problem/2044/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long m=input.nextLong();
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            long row1=m;
            long row2=m;
            long res=Math.min(row1,a)+Math.min(row2,b);
            long rowC=row1+row2-res;
            res+=Math.min(rowC,c);
            System.out.println(res);
        }
            
    }
}
