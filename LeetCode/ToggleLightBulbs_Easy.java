// https://leetcode.com/problems/toggle-light-bulbs/

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] isLight=new boolean[101];
        Arrays.fill(isLight,false);
        for(int num:bulbs){
            if(isLight[num]==false){
                isLight[num]=true;
            }else isLight[num]=false;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<101;i++){
            if(isLight[i]==true) list.add(i);
        }
        return list;
    }
}
