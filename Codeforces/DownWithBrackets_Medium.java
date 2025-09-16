// https://codeforces.com/contest/2110/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            int count=0;
            boolean isTrue=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    count++;
                }
                else{
                    count--;
                    if(count==0 && i!=s.length()-1){
                        isTrue=true;
                        break;
                    }
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
