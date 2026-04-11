// https://www.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1?page=6&status=unsolved&sortBy=submissions

class Solution {
    String findSum(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(i>=0 || j>=0 || carry>0){
            int val1=(i>=0)?s1.charAt(i--)-'0':0;
            int val2=(j>=0)?s2.charAt(j--)-'0':0;
            int sum=val1+val2+carry;
            sb.append(sum%10);
            carry=sum/10;
        }
        String result=sb.reverse().toString();
        int k=0;
        while(k<result.length()-1 && result.charAt(k)=='0'){
            k++;
        }
        return result.substring(k);
    }
}
