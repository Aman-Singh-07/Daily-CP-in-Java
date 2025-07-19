https://codeforces.com/problemset/problem/520/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        String str=input.next();
        HashSet<Character> s=new HashSet<>();
        str=str.toLowerCase();
        for(int i=0;i<t;i++){
            s.add(str.charAt(i));
        }
        System.out.println(s.size()==26?"YES":"NO");
   }
}
