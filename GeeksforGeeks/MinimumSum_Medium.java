//  https://www.geeksforgeeks.org/problems/minimum-sum4058/1?page=13&sortBy=submissions

import java.io.IOException;
import java.util.PriorityQueue;
class Solution {
    static String minSum(int[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr) pq.add(num);

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();

        while(!pq.isEmpty()){
            s1.append(pq.poll());
            if(!pq.isEmpty()) s2.append(pq.poll());
        }
        return addString(s1.toString(),s2.toString());
    }
    static String addString(String s1,String s2){
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0) sum+=(s1.charAt(i--)-'0');
            if(j>=0) sum+=(s2.charAt(j--)-'0');
            res.append(sum%10);
            carry=sum/10;
        }
        String result=res.reverse().toString();
        int index=0;
        while(index<result.length() && result.charAt(index)=='0'){
            index++;
        }
        return index==result.length()?"0":result.substring(index);
    }
}
