// https://www.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1?page=4&category=Strings&status=unsolved&sortBy=submissions

class Solution {
    public int findSum(String s) {
        // code here
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                if(sb.length()!=0) list.add(sb.toString());
                sb.setLength(0);
                
            }else sb.append(ch);
        }
        if(sb.length()!=0) list.add(sb.toString());
        long sum=0;
        for(String str:list){
            sum+=Integer.valueOf(str);
        }
        return (int) sum;
    }
}
