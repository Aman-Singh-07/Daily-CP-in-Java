// https://codeforces.com/problemset/problem/1537/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                sum+=x;
            }
            if(sum-n<0) System.out.println(1);
            else if(sum<=0) System.out.println(1);
            else System.out.println(sum-n);
        }
        
    }
}
