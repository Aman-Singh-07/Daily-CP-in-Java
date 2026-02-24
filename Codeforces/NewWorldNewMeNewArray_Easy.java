// https://codeforces.com/problemset/problem/2072/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            k=Math.abs(k);
            int p=input.nextInt();
            if(p*n<k) System.out.println(-1);
            else{
                if(k%p==0 && n>=(k/p)) System.out.println(k/p);
                else if(k%p!=0 && n>=((k/p)+1)) System.out.println((k/p)+1);
                else System.out.println(-1);
            }
        }
    }
}
