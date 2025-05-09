// https://codeforces.com/problemset/problem/41/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        boolean isTrue=true;
        if(s1.length()!=s2.length()){
            isTrue=false;
        }
        else{
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(s2.length()-1-i)){
                isTrue=false;
                break;
            }
        }
        }
        System.out.println(isTrue?"YES":"NO");
    }
}
