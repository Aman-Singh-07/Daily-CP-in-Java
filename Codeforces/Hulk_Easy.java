// 

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            if(i%2!=0 && i-n==0) sb.append("I hate it");
            else if(i%2==0 && i-n==0) sb.append("I love it");
            else if(i%2==0) sb.append("I love that ");
            else sb.append("I hate that ");
        }
        System.out.println(sb.toString());
        
    }
}
