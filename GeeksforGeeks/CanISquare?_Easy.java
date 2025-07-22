// https://codeforces.com/problemset/problem/1915/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=input.nextLong();
            }
            long num=(int) Math.sqrt(sum);
            if(num*num==sum){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
    }
}
