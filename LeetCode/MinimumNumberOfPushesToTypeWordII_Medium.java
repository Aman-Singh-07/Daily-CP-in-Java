// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/description/?envType=daily-question&envId=2026-07-31

class Solution {
    public int minimumPushes(String word) {
        int[] map= new int[26];
        for(char ch:word.toCharArray()){
            map[ch-'a']++;
        }
        int minPushing = 0;
        Arrays.sort(map);
        for(int i=25,pushCnt=0;i>=0;i--){
            int currEleIdx=25-i;
            if(currEleIdx%8==0)
                pushCnt++;
            minPushing+=map[i]*pushCnt;
        }
        return minPushing;
    }
}
