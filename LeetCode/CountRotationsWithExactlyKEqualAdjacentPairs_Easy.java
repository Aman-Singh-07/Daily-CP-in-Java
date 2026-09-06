// https://leetcode.com/problems/count-rotations-with-exactly-k-equal-adjacent-pairs/description/

class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int ct=0;
            for(int j=0;j<ch.length-1;j++){
                if(ch[j]==ch[j+1]) ct++;
            }
            char c=ch[0];
            if(ct==k) count++;
            for(int j=0;j<ch.length-1;j++){
                ch[j]=ch[j+1];
            }
            ch[ch.length-1]=c;

        }
        return count;
    }
}
