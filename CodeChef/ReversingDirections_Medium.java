// https://www.codechef.com/problems/DIRECTI

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        input.nextLine();
        while(t-->0){
            int n=input.nextInt();
            input.nextLine();
            ArrayList<String[]> list=new ArrayList<>();

            for(int i=0;i<n;i++){
                String s=input.nextLine();
                list.add(s.split(" ", 3));
            }
            Collections.reverse(list); 
            ArrayList<String[]> l=new ArrayList<>();
            for(String[] arr:list){
                l.add(Arrays.copyOf(arr,arr.length));
            }
            for(int i=1;i<n;i++){
                if(l.get(i-1)[0].equals("Right")){
                    list.get(i)[0]="Left";
                }else if(l.get(i-1)[0].equals("Left")){
                    list.get(i)[0]="Right";
                }
            }
            list.get(0)[0]="Begin";
            for (String[] instr:list){
                System.out.println(String.join(" ",instr));
            }
            System.out.println();
        }
    }
}
