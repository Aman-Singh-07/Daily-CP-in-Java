// https://codeforces.com/problemset/problem/723/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x1=input.nextInt();
        int x2=input.nextInt();
        int x3=input.nextInt();
        int largest=Math.max(x1,x2);
        int secondLargest=Math.min(x1,x2);
        if(x3>largest){
            secondLargest=largest;
            largest=secondLargest;
        }
        else if(x3>secondLargest && x3!=largest){
            secondLargest=x3;
        }
        
        if(secondLargest==x1){
            System.out.println(Math.abs(x1-x2)+Math.abs(x1-x3));
        }
        else if(secondLargest==x2){
            System.out.println(Math.abs(x1-x2)+Math.abs(x2-x3));
        }
        else if(secondLargest==x3){
            System.out.println(Math.abs(x1-x3)+Math.abs(x2-x3));
        }
        
        
    }
}
