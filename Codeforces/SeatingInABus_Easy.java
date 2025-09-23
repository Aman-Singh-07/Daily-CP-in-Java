// https://codeforces.com/problemset/problem/2000/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int first=input.nextInt();
            int l=first,r=first;
            boolean isTrue=true;
            for(int i=1;i<n;i++){
                int x=input.nextInt();
                l=Math.min(l,x);
                r=Math.max(r,x);
                if(r-l+1!=i+1){
                    isTrue=false;
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
