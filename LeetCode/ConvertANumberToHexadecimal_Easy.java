// https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/

class Solution {
    public String toHex(int num) {
        char[] hexDigits={ '0', '1', '2', '3', '4', '5', '6', '7','8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        long k=num;
        if (num<0) k=(1L<<32)+k;
        if(k==0) return "0";
        StringBuilder res=new StringBuilder();
        while(k!=0){
            int rem=(int) (k%16);
            k/=16;
            res.append(hexDigits[rem]);
        }
        return res.reverse().toString();
    }
}
