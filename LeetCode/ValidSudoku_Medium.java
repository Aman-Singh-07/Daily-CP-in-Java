// https://leetcode.com/problems/valid-sudoku/description/?envType=daily-question&envId=2025-08-30

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.'){
                    if(!seen.add(num+" in row "+i)) return false;
                    if (!seen.add(num+" in col "+j)) return false;
                    if (!seen.add(num+" in box "+(i/3)+"-"+ (j/3))) return false;
                }
            }
        }
        return true;
    }
}
