// https://codeforces.com/problemset/problem/432/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int k=input.nextInt();
            int count=0;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                if(x<5) list.add(x);
            }
            Collections.sort(list);
            for(int i=2;i<list.size();i+=3){
                count+=(5-list.get(i))>=k?1:0;
            }
            System.out.println(count);
    }
}
