// https://codeforces.com/problemset/problem/1883/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            String s=input.next();
            HashMap<Character,Integer> map=new HashMap<>();
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int oddCount=0;
            for(int value:map.values()){
                if(value%2!=0){
                    oddCount++;
                }
            }
            if(k>=Math.max(0,oddCount-1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
