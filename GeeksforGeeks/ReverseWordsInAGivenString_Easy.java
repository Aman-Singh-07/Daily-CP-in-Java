// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

class Solution {
    public String reverseWords(String s) {
        // Code here
        ArrayList<String> list=new ArrayList<>();
        String[] st=s.split("\\.");
        for(String ss:st){
            if(!ss.isEmpty()) list.add(ss);
        }
        Collections.reverse(list);
        return String.join(".",list);
    }
}
