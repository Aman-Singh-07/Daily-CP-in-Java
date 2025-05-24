// https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> l=new ArrayList<>();
        int count=0;
        for(String s:words){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==x){
                    l.add(count);
                    break;
                }
            }
            count++;
        }
        return l;
        
    }
}
