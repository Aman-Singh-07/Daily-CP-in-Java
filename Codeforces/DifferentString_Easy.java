//  https://codeforces.com/problemset/problem/1971/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n-->0){
            int count=0;
            String s=input.next();
            char c=s.charAt(0);
            int index=-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=c){
                    index=i;
                    count++;
                    break;
                }
            }
            if(count==0) System.out.println("NO");
            else{
                System.out.println("YES");
                String result = s.charAt(index) 
                              + s.substring(1, index) 
                              + c 
                              + s.substring(index + 1);
                System.out.println(result);
            }
        }
    }
}
