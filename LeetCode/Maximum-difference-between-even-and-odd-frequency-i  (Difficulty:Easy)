// https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/?envType=daily-question&envId=2025-06-10

class Solution {
    public int maxDifference(String s) {
        // HashSet<Character> set=new HashSet<>();
        // for(char c:s.toCharArray()){
        //     if(!set.contains(c)) set.add(c);
        // }
        // ArrayList<Integer> count=new ArrayList<>();
        // for(char c1:set){
        //     int countNum=0;
        //     for(char c2:s.toCharArray()){
        //         if(c1==c2) countNum++;
        //     }
        //     count.add(countNum);
        // }
        // int minEven=0;
        // int maxOdd=0;
        // Collections.sort(count);
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        int minEven=s.length();
        int maxOdd=0;
        for(int num:count){
            if(num%2==0){
                minEven=Math.min(num==0?s.length():num,minEven);
               
            }
            else{
                maxOdd=Math.max(num,maxOdd);
            }
        }
        return maxOdd-minEven;
    }
}
