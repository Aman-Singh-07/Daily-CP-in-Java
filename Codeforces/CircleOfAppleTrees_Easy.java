// https://codeforces.com/problemset/problem/2153/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                set.add(x);
            }
            System.out.println(set.size());
        }
    }
}
