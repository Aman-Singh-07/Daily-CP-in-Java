// https://codeforces.com/problemset/problem/540/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        String s1=input.next();
        String s2=input.next();
        int res=0;
        for(int i=0;i<s1.length();i++){
            res+=Math.min(Math.abs(Integer.valueOf(s1.charAt(i))-Integer.valueOf(s2.charAt(i))),Math.abs(9-Math.max(Integer.valueOf(s2.charAt(i)),Integer.valueOf(s1.charAt(i)))+Math.min(Integer.valueOf(s2.charAt(i)),Integer.valueOf(s1.charAt(i)))+1));
        }
        System.out.println(res);
        
    }
}
