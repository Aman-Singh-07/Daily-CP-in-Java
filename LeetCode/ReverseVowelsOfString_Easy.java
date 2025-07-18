// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> ch=new ArrayList<>();
        String st=new String("aeiouAEIOU");
        for(int i=0;i<s.length();i++){
            if(st.indexOf(s.charAt(i))!=-1){
                ch.add(s.charAt(i));
            }
        }
        Collections.reverse(ch);
        int t=0;
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<s.length();k++){
            if(st.indexOf(s.charAt(k))!=-1){
                sb.append(ch.get(t));
                t++;
            }
            else{
                sb.append(s.charAt(k));
            }
        }
        return sb.toString();
    }
}
