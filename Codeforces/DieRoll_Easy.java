// https://codeforces.com/problemset/problem/9/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int y=input.nextInt();
            int w=input.nextInt();
            if(7-Math.max(y,w)==6){
                 System.out.println(1+"/"+1);
            }
            else if(7-Math.max(y,w)==5){
                System.out.println(5+"/"+6);
            }
            else if(7-Math.max(y,w)==4){
                System.out.println(2+"/"+3);
            }
            else if(7-Math.max(y,w)==3){
                System.out.println(1+"/"+2);
            }
            else if(7-Math.max(y,w)==2){
                System.out.println(1+"/"+3);
            }
            else if(7-Math.max(y,w)==1){
                System.out.println(1+"/"+6);
            }
            else{
                System.out.println(0+"/"+1);
            }
    }
}
