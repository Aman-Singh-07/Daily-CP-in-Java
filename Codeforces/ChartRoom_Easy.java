// https://codeforces.com/problemset/problem/58/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='h' && count==0){
                sb.append(str.charAt(i));
                count++;
            }
            else if(str.charAt(i)=='e' && count==1){
                sb.append(str.charAt(i));
                count++;
            }
            else if(str.charAt(i)=='l' && count==2){
                sb.append(str.charAt(i));
                count++;
            }
            else if(str.charAt(i)=='l' && count==3){
                sb.append(str.charAt(i));
                count++;
            }
            else if(str.charAt(i)=='o' && count==4){
                sb.append(str.charAt(i));
                count++;
            }
        }
        System.out.println(sb.toString().equals("hello")?"YES":"NO");
    }
}
