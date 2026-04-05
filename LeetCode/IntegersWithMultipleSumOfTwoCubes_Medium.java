// https://leetcode.com/problems/integers-with-multiple-sum-of-two-cubes/

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=(int) Math.cbrt(n);
        for(int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                int cube=(i*i*i)+(j*j*j);
                if(cube<=n){
                    map.put(cube,map.getOrDefault(cube,0)+1);
                }else break;
            }
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>=2){
                list.add(m.getKey());
            }
        }
        Collections.sort(list);
        return list;
        
    }
}
