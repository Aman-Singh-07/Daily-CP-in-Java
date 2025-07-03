// https://codeforces.com/problemset/problem/1520/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            Set<Character> set=new HashSet<>();
            boolean isTrue=true;
            char previous=s.charAt(0);
            set.add(previous);
            for(int i=1;i<n;i++){
                char current=s.charAt(i);
                if(current!=previous){
                    if(set.contains(current)){
                        isTrue=false;
                        break;
                    }
                    set.add(current);
                }
                previous=current;
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
 
