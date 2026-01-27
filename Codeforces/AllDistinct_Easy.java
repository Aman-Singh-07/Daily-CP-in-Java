// https://codeforces.com/problemset/problem/1692/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int num=input.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
            }
            long sum=0;
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                sum+=m.getValue()-1;
            }
            if(sum%2!=0) sum++;
            System.out.println(n-(sum));
        }
    }
}
