// https://codeforces.com/contest/1890/problem/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int[] arr=new int[input.nextInt()];
            for(int i=0;i<arr.length; i++){
                arr[i]=input.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int num:arr){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            if(map.size()==1){
                System.out.println("Yes");
            }else if(map.size()==2){
                if(Math.abs((int)map.values().toArray()[0]-(int)(map.values().toArray()[1]))<=1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }
    }
}
