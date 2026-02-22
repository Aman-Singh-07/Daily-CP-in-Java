// https://leetcode.com/problems/maximum-bitwise-xor-after-rearrangement/

class Solution {
    public String maximumXor(String s, String t) {
        int count0=0;
        int count1=0;
        for(char ch:t.toCharArray()){
            if(ch=='1') count1++;
            else count0++;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                if(count0>0){
                    sb.append('1');
                    count0--;
                }else{
                    sb.append('0');
                    count1--;
                }
            }
            else{
                if(count1>0){
                    sb.append('1');
                    count1--;
                    
                }else{
                    sb.append('0');
                    count0--;
                }
            }
        }
        return sb.toString();
    }
}
