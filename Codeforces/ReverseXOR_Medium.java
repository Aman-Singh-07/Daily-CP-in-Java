// https://codeforces.com/contest/2160/problem/C

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=Integer.toBinaryString(n);
            s=s.replaceAll("0+$","");
            int ones=0;
            for(char c:s.toCharArray()){
                if(c=='1') ones++;
            }
            if(ones%2==0 && isPalindrome(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
