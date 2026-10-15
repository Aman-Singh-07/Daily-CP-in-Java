// https://www.geeksforgeeks.org/problems/geek-hates-too-many-1s--170647/1
class Solution {
    public int maxValue(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        while(s.contains("111")){
            s=s.replace("111","110");
        }
        return Integer.parseInt(s, 2);
    }
}
