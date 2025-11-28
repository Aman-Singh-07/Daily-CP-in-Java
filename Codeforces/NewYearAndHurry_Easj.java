// https://codeforces.com/contest/750/problem/A

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int time=240-k; 
        int count=0;
        int i=1;
        while(i<=n && time>=5*i){
            time-=5*i;
            count++;
            i++;
        }
        System.out.println(count);
    }
}
