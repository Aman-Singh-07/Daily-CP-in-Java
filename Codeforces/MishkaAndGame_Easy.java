//  https://codeforces.com/problemset/problem/703/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int countM=0;
        int countC=0;
        while(t-->0){
            int m=input.nextInt();
            int c=input.nextInt();
            if(m>c) countM++;
            else if(c>m) countC++;
            
        }
        System.out.println(countM>countC?"Mishka":countM==countC?"Friendship is magic!^^":"Chris");
        
    }
}
