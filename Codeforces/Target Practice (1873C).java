// https://codeforces.com/problemset/problem/1873/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        input.nextLine();
        while(t-->0){
           int total=0;
            for(int i=0;i<10;i++){
                String s=input.nextLine();
                for(int j=0;j<10;j++){
                    if(s.charAt(j)=='X'){
                        int res=Math.min(Math.min(i,j),Math.min(9-i,9-j));
                        total+=res+1;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
