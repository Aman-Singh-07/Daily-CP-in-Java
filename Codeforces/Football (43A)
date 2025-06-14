// https://codeforces.com/problemset/problem/43/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        HashSet<String> set=new HashSet<>();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=input.next();
            set.add(s[i]);
        }
        int maxCount=0;
        String[] res=new String[1];
        for(String st:set){
            int count=0;
            for(String str:s){
                if(st.equals(str)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                res[0]=st;
            }
        }
        System.out.println(res[0]);
    }
}
