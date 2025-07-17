// https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        int countRL=0;
        int countUD=0;
        for(char c:moves.toCharArray()){
            if(c=='R'){
                countRL++;
            }
            else if(c=='L'){
                countRL--;
            }
            else if(c=='U'){
                countUD++;
            }
            else{
                countUD--;
            }
        }
        return countRL==0 && countUD==0;
        
    }
}
