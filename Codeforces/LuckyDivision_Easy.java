// https://codeforces.com/problemset/problem/122/A

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean isTrue=false;
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        for(int num:luckyNumbers){
            if(n%num==0){
                isTrue=true;
                break;
            }
        }
        System.out.println(isTrue?"YES":"NO");
    }
}
