// https://leetcode.com/problems/largest-3-same-digit-number-in-string/

class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb=new StringBuilder();
        char ch='0';
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2) && num.charAt(i)>=ch){
                sb.setLength(0);
                ch=num.charAt(i);
                sb.append(num.charAt(i));
                sb.append(num.charAt(i));
                sb.append(num.charAt(i));
            }
        }
        return sb.toString();
    }
}
