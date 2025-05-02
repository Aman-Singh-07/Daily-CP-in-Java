// https://codeforces.com/problemset/problem/131/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        if (str.equals(str.toUpperCase())) {
            str=str.toLowerCase();
        }
        else if ((str.charAt(0) != str.toUpperCase().charAt(0) && str.substring(1).equals(str.substring(1).toUpperCase()))) {
            str=str.toLowerCase();
            str=str.substring(0,1).toUpperCase() + str.substring(1);
        }
        System.out.println(str);
    }
}
