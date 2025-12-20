// https://www.codechef.com/problems/LIFTME

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int q=input.nextInt();
            long sum=0;
            int currentFloor=0;
            for(int i=0;i<q;i++){
                int f=input.nextInt();
                int d=input.nextInt();
                sum+=Math.abs(currentFloor-f); 
                sum+=Math.abs(f-d);
                currentFloor=d;
            }
            System.out.println(sum);
        }
    }
}
