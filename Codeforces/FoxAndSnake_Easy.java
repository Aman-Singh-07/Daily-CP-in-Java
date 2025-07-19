// https://codeforces.com/problemset/problem/510/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int c=input.nextInt();
        for(int i=1;i<=r;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<c;j++){
                if(i%2!=0){
                    sb.append("#");
                }
                else if(i%2==0){
                    sb.append(".");
                }
            }
            sb.append("#");
            if(i%4!=0){
                System.out.println(sb.toString());
            }
            else{
                sb.reverse();
                System.out.println(sb.toString());
            }
        }
    
    }
}
