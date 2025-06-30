// https://codeforces.com/problemset/problem/1950/C

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        input.nextLine();
        while(t-->0){
           String time=input.nextLine();
           String[] st=time.split(":");
           int hour=Integer.valueOf(st[0]);
           String minute=st[1];
            if(hour>12){
                System.out.printf("%02d:%s PM%n",hour-12,minute);
            }else if(hour==0){
                System.out.printf("12:%s AM%n",minute);
            }else if(hour==12){
                System.out.printf("12:%s PM%n",minute);
            }else{
                System.out.printf("%02d:%s AM%n",hour,minute);
            }
        }
    }
}
