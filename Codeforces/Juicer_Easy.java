// https://codeforces.com/problemset/problem/709/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int b=input.nextInt();
        int d=input.nextInt();

        int empties=0;
        int waste=0;

        for(int i=0;i<n;i++){
            int size=input.nextInt();
            if(size<=b){
                waste+=size;
                if(waste>d){
                    empties++;
                    waste=0;
                }
            }
        }
        System.out.println(empties);
    }
}
