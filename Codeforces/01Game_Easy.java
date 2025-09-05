// https://codeforces.com/problemset/problem/1373/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int count1=0,count0=0;
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    count1++;
                }
                else count0++;
            }
            int count=Math.min(count1,count0);
            System.out.println(count%2==0?"NET":"DA");
        }
    }
}
