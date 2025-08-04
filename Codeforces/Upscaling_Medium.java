//  https://codeforces.com/problemset/problem/1950/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String hash="##";
            String dot="..";
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if((i+j)%2==0) sb.append(hash);
                    else sb.append(dot);
                }
                
                list.add(sb.toString());
                list.add(sb.toString());
                
            }
            for(String s:list){
                System.out.println(s);
            }
        }
    }
}
