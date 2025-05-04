// https://codeforces.com/problemset/problem/1352/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            int p=1;
            while(x>0){
                int r=x%10;
                if(r!=0){
                    list.add(r*p);
                }
                x/=10;
                p*=10;
            }
            System.out.println(list.size());
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}
