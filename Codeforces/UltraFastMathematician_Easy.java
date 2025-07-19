// https://codeforces.com/problemset/problem/61/A
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String st1=input.next();
        String st2=input.next();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<st1.length();i++){
            if(st1.charAt(i)==st2.charAt(i)) res.append("0");
            else res.append("1");
        }
        System.out.println(res.toString());
    }
}
