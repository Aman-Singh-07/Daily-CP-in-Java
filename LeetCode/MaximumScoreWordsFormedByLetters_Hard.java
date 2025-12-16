// https://leetcode.com/problems/maximum-score-words-formed-by-letters/description/


class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        ArrayList<int[]> list=new ArrayList<>();
        int[] sR=new int[words.length];
        for(int i=0;i<words.length;i++){
            int[] freq1=new int[26];
            int s=0;
            for(int j=0;j<words[i].length();j++){
                freq1[words[i].charAt(j)-'a']++;
                s+=score[words[i].charAt(j)-'a'];
            }
            list.add(freq1);
            sR[i]=s;
        }
        int[] freq2=new int[26];
        for(char ch:letters){
            freq2[ch-'a']++;
        }

        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<(1<<words.length);i++){
            int[] temp=freq2.clone();
            int r=0;
            boolean isTrue=true;
            for(int j=0;j<words.length;j++){
                if((i & (1 << j))!= 0){
                    for(int k=0;k<26;k++){
                        if(list.get(j)[k]>temp[k]){
                            isTrue=false;
                            break;
                        }
                    }
                    for(int k=0;k<26;k++){
                        temp[k]-=list.get(j)[k];
                    }
                    r+=sR[j];
                }
            }
            if(isTrue) res.add(r);
        }
        int max=0;
        for(int num:res){
            if(num>max){
                max=num;
            }
        }
        return max;


    }
}
