// https://codeforces.com/problemset/problem/1742/C

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String[] grid=new String[8];
            for(int i=0;i<8;i++){
                grid[i]=input.next();
            }
            boolean isTrue=false;
            for(int i=0;i<8;i++){
                if(grid[i].equals("RRRRRRRR")){
                    System.out.println("R");
                    isTrue=true;
                    break;
                }
            }
            if(!isTrue){
                System.out.println("B");
            }
        }
    }
}
