// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/?envType=daily-question&envId=2025-10-13

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        String prev="";
        for(String word:words){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!sorted.equals(prev)){
                result.add(word);   
                prev=sorted;    
            }
        }
        return result;
    }
}
