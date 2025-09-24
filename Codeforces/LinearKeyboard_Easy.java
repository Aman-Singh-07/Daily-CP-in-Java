// https://codeforces.com/problemset/problem/1607/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String org=input.next();
            String s=input.next();
            ArrayList<Character> list=new ArrayList<>();
            for(char c:org.toCharArray()){
                list.add(c);
            }
            ArrayList<Integer> l=new ArrayList<>();
            for(char c:s.toCharArray()){
                l.add(list.indexOf(c)+1);
            }
            int sum=0;
            for(int i=1;i<s.length();i++){
                sum+=Math.abs(l.get(i)-l.get(i-1));
            }
            System.out.println(sum);

        }
    }
}
