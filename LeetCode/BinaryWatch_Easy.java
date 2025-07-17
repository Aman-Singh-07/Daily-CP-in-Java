// https://leetcode.com/problems/binary-watch/

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                int count=Integer.bitCount(h)+Integer.bitCount(m);
                if(count==turnedOn){
                    result.add(h + ":" + String.format("%02d", m));
                }
            }
        }
        return result;
    }
}
