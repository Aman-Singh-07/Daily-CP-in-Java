// https://www.codechef.com/problems/GOODRANK2?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int n=Math.min(10, t);
        System.out.println(n);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=t;i++) list.add(i);
    
        printList(list);
        
        for(int i=0;i<n-2;i++){
            rotateRightByOne(list); 
            printList(list);
        }

        Collections.reverse(list);
        printList(list);
    }

    public static void printList(List<Integer> list){
        for(int x:list){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void rotateRightByOne(List<Integer> list){
        int last=list.get(list.size()-1);
        for(int i=list.size()-1;i>0;i--){
            list.set(i,list.get(i-1));
        }
        list.set(0,last);
    }
}
