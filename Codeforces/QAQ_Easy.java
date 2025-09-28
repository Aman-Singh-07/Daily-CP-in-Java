// https://codeforces.com/problemset/problem/894/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='Q') list1.add(i);
            if(s.charAt(i)=='A') list2.add(i);
        }
        int count=0;
        Collections.sort(list1);
        Collections.sort(list2);
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                int[] arr=new int[2];
                arr[0]=list1.get(i);
                arr[1]=list1.get(j);
                list.add(arr);
            }
        }
        for(int i=0;i<list2.size();i++){
            for(int[] a:list){
                if(a[1]>list2.get(i) && list2.get(i)>a[0]){
                    count++;
                }
            }
        }
        System.out.println(count);
   
    }
}
