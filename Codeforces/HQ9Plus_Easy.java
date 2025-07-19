// https://codeforces.com/problemset/problem/133/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String sr="HQ9";
        for(int i=0;i<s.length();i++){
                if(sr.indexOf(s.charAt(i))!=-1){
                    System.out.println("YES");
                    return;
                    
                }
        }
        System.out.println("NO");
    }
}
