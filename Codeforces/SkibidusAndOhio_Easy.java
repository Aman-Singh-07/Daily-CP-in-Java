//  https://codeforces.com/contest/2065/problem/B

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            boolean isTrue=false;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    isTrue=true;
                    break;
                }
            }
            
            System.out.println(isTrue?1:s.length());
        }
    }
}
