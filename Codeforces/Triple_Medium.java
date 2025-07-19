// https://codeforces.com/problemset/problem/1669/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                map.put(x,map.getOrDefault(x,0)+1);
            }
            boolean isTrue=false;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                if(entry.getValue()>=3) {
                    System.out.println(entry.getKey());
                    isTrue=true;
                    break;
                }
            }
            if(!isTrue) System.out.println(-1);
            
        }
    }
}
