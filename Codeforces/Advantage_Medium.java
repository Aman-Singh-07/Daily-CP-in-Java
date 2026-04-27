// https://codeforces.com/contest/1760/problem/C

import java.util.*;
 public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t= input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            List<Integer>list=new ArrayList<>();
            List<Integer>list1=new ArrayList<>();
            for (int i = 0; i <n ; i++){
                list.add(input.nextInt());
                list1.add(list.get(i));
            }
            Collections.sort(list1);
            for (int i = 0; i <n ; i++) {
                if(list.get(i)== list1.get(n-1)) System.out.print((list.get(i)-list1.get(n-2))+" ");
                else System.out.print((list.get(i)- list1.get(n-1))+" ");
            }
            System.out.println();
        }
    }
}
