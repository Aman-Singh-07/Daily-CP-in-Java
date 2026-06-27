// https://codeforces.com/contest/2237/problem/A

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int a=input.nextInt();
            int sum=a;
            for(int i=1;i<n;i++){
                int b=input.nextInt();
                if(a<b){
                    sum+=a;
                }
                else{
                    sum+=b;
                    a=b;
                }
            }
            System.out.println(sum);
        }
    }
}
