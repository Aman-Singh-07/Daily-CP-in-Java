// https://codeforces.com/contest/1862/problem/B

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            ArrayList<Integer> b=new ArrayList<>();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                b.add(input.nextInt());
            }
            a.add(b.get(0));
            for(int i=1;i<n;i++){
                if(b.get(i)>=b.get(i-1)){
                    a.add(b.get(i));
                }else{
                    a.add(b.get(i));
                    a.add(b.get(i));
                }
            }
            System.out.println(a.size());
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
