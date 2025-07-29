//  https://codeforces.com/problemset/problem/1850/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8;i++){
                String s=input.next();
                for(int j=0;j<8;j++){
                    if(Character.isAlphabetic(s.charAt(j))){
                        sb.append(s.charAt(j));
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
