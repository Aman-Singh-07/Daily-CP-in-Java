// https://www.geeksforgeeks.org/problems/count-the-characters1821/1

class Solution {
    int getCount(String s, int k) {
        // code here
        int[] freq=new int[26];
        char ch=s.charAt(0);
        freq[ch-'a']++;
        for(int i=1;i<s.length();i++){
            if(ch!=s.charAt(i)){
                ch=s.charAt(i);
                freq[ch-'a']++;
            }
        }
        int count=0;
        for(int num:freq) if(num==k) count++;
        return count;
    }
}
