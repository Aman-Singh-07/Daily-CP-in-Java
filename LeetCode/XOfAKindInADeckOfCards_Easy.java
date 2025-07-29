// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int c:deck){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int gcd=-1;
        for(int count:freq.values()){
            if(gcd==-1) gcd=count;
            else gcd=gcdFinder(gcd,count);
        }

        return gcd>1;

    }


    public static int gcdFinder(int a, int b){
        if(b==0) return a;
        return gcdFinder(b,a%b);
    }
}
