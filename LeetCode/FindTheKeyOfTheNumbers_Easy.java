// https://leetcode.com/problems/find-the-key-of-the-numbers/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1=String.format("%04d",num1);
        String s2=String.format("%04d",num2);
        String s3=String.format("%04d",num3);

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<4;i++){
            int d1=s1.charAt(i)-'0';
            int d2=s2.charAt(i)-'0';
            int d3=s3.charAt(i)-'0';
            sb.append(Math.min(d1, Math.min(d2, d3)));
        }

        return Integer.parseInt(sb.toString());
    }
}
