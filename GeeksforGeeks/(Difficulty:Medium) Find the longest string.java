// https://www.geeksforgeeks.org/problems/find-the-longest-string--170645/1

class Solution {
    public String longestString(String[] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a.length()==b.length()) return a.compareTo(b);
            return a.length()-b.length();
        });
        Set<String> built=new HashSet<>();
        String result="";
        for(String word:arr){
            if(word.length()==1 || built.contains(word.substring(0, word.length()-1))) {
                built.add(word);
                if(word.length()>result.length() || (word.length()==result.length() && word.compareTo(result)<0)){
                    result=word;
                }
            }
        }
        return result;
    }
}
