// https://codeforces.com/problemset/problem/2203/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            int d=input.nextInt();
            int sum=0;
            int count=1;
            for(int i=0;i<n;i++){
                sum+=m;
                if(sum<=(d+m)){
                    continue;
                }else{
                    count++;
                    sum=m;
                }
            }
            System.out.println(count);
        }
    }
}
