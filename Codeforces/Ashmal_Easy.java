// https://codeforces.com/problemset/problem/2180/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            String[] s=new String[n];
            for(int i=0;i<n;i++){
                s[i]=input.next();
            }
            String st=s[0];
            for(int i=1;i<n;i++){ 
                String option1=s[i]+st; 
                String option2=st+s[i];
                if(option1.compareTo(option2)<0) st=option1; 
                else st=option2;
            }
            System.out.println(st);
        }
    }
}
