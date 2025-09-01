// https://codeforces.com/problemset/problem/1913/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int count0=0,count1=0;
            for(char c:s.toCharArray()){
                if(c=='0') count0++;
                else count1++;
            }
            int ans=s.length();
            int remaining0=count0,remaining1=count1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    if(remaining1>0){
                        remaining1--;
                    }else{
                        ans=s.length()-i;
                        break;
                    }
                }else{
                    if(remaining0>0){
                        remaining0--;
                    }else{
                        ans=s.length()-i;
                        break;
                    }
                }
                ans=Math.min(ans,remaining0+remaining1);
            }

            System.out.println(ans);
        }
    }
}
