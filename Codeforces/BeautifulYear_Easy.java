// https://codeforces.com/problemset/problem/271/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        for(int i=year+1;i<=9999;i++){
            HashSet<Integer> set=new HashSet<>();
            int d=i;
            while(d>0){
                int r=d%10;
                set.add(r);
                d/=10;
            }
            if(set.size()==4){
                System.out.println(i);
                break;
            }
        }
    }
}
