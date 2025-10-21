// https://codeforces.com/contest/2154/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            String s=input.next();
            int count=n;
            int res=0;
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    if(k-1<=count) res++;
                    count=0;
                }
                else count++;
            }
            System.out.println(res);
        }
    }
}
