// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=3&sortBy=submissions

class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        String[] str=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>0;i--){
            sb.append(str[i]+" ");
        }
        sb.append(str[0]);
        return sb.toString();
    }
}
