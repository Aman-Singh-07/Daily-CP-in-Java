// https://leetcode.com/problems/maximum-69-number/?envType=daily-question&envId=2025-08-16

class Solution {
    public int maximum69Number (int num) {
        char[] ch=String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i]='9';
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        return Integer.valueOf(sb.toString());
        
    }
}
