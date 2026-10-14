// https://www.geeksforgeeks.org/problems/roll-the-characters-of-a-string2127/1

class Solution {
    public String findRollOut(String s, int[] roll) {
        // code here
        int[] arr=new int[s.length()];
        for(int i=0;i<roll.length;i++){
            arr[roll[i]-1]++;
        }
        for(int i=s.length()-2;i>=0;i--){
            arr[i]+=arr[i+1];
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int req=arr[i]%26;
            char ch=(char)('a'+(s.charAt(i)-'a'+req)%26);
            sb.append(ch);
        }
        return sb.toString();
    }
}
