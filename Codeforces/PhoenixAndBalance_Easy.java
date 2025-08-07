// https://codeforces.com/problemset/problem/1348/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=1;i<=n;i++){
                list.add((int)Math.pow(2,i));
            }
            int sum1=list.get(n-1);
            int sum2=0;
            for(int i=0;i<(n/2)-1;i++){
                sum1+=list.get(i);
            }
            for(int i=n-2;i>=(n/2)-1;i--){
                sum2+=list.get(i);
            }
            System.out.println(sum1-sum2);
        }
    }
}
