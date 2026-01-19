// https://www.geeksforgeeks.org/problems/remove-k-digits/1

import java.util.*;

class Solution {
    public String removeKdig(String s, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            while(!list.isEmpty() && k>0 && list.get(list.size()-1)>num){
                list.remove(list.size()-1);
                k--;
            }
            list.add(num);
        }
        while(k>0 && !list.isEmpty()){
            list.remove(list.size()-1);
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int num:list) sb.append(num);
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0') i++;
        String result=sb.substring(i);
        
        return result.isEmpty()?"0":result;
    }
}
