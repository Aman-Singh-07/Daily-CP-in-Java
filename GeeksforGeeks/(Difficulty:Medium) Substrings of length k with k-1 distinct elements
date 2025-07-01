// https://www.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1

class Solution {
    public int substrCount(String s, int k) {
        // code here
        int count=0;
         for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            HashSet<Character> set=new HashSet<>();
            for(char c:sub.toCharArray()){
                set.add(c);
            }
            if(set.size()==k-1){
                count++;
            }
        }
        return count;
    }
}
