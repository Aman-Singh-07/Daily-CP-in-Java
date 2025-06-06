// https://leetcode.com/problems/first-unique-character-in-a-string/
// Do it with more optimised way by using frequency
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        for(char c:set){
            int count=0;
            for(int i=0;i<n;i++){
                if(c==s.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                return s.indexOf(c);
            }
        }
        return -1;
        
    }
}
