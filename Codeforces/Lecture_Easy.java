// https://codeforces.com/problemset/problem/499/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i<m;i++){
            list1.add(input.next());
            list2.add(input.next());
        }
        ArrayList<String> lecture=new ArrayList<>();
        for(int i=0;i<n;i++){
            lecture.add(input.next());
        }
        ArrayList<String> res=new ArrayList<>();
        for(String s1:lecture){
            if(s1.length()<=list2.get(list1.indexOf(s1)).length()){
                res.add(s1);
            }
            else res.add(list2.get(list1.indexOf(s1)));
        }

        for(String s:res){
            System.out.print(s+" ");
        }
    }
}
