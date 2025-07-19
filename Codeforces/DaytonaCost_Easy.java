// https://codeforces.com/problemset/problem/1878/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
          int n=input.nextInt();
          int k=input.nextInt();
          ArrayList<Integer> list=new ArrayList<>();
          for(int i=0;i<n;i++){
              int x=input.nextInt();
              list.add(x);
          }
          System.out.println(list.contains(k)?"YES":"NO");
        }
    }
}
