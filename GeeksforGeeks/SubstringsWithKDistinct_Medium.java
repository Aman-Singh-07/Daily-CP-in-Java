// https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1

class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        return resCount(s,k)-resCount(s,k-1);
    }
    
    public static int resCount(String s,int k){
        int res=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()>k){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
            res+=(i-j+1);
            
        }
        return res;
    }
}
