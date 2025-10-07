// https://leetcode.com/problems/avoid-flood-in-the-city/description/?envType=daily-question&envId=2025-10-07

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n=rains.length;
        int[] res=new int[n];
        Arrays.fill(res,1); 
        HashMap<Integer, Integer> map=new HashMap<>();
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            int num=rains[i];
            if(num==0){
                set.add(i);
            }else{
                res[i]=-1;
                if(map.containsKey(num)){
                    Integer d=set.higher(map.get(num));
                    if(d==null){
                        return new int[0];
                    }
                    res[d]=num;
                    set.remove(d);
                }
                map.put(num,i);
            }
        }
        return res;
    }
}
