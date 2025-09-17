// https://codeforces.com/problemset/problem/1633/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int num=input.nextInt();
            if(num%7==0){
                System.out.println(num);
            }
            else{
                int temp=num/10;
                for(int i=1;i<=9;i++){
                    if(((temp*10)+i)%7==0){
                        System.out.println(temp*10+i);
                        break;
                    }
                }
            }
        }
    }
}
