// https://leetcode.com/problems/reverse-words-with-same-vowel-count/description/

class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(String st:words){
            int count=0;
            for(char ch:st.toCharArray()){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
            }
            list.add(count);
        }
        int count1=list.get(0);
        for(int i=1;i<words.length;i++){
            if(list.get(i)==count1)
                words[i]=new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ",words);
        
    }
}
