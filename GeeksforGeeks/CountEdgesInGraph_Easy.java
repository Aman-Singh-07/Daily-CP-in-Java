// https://www.geeksforgeeks.org/problems/count-number-of-edges-in-an-undirected-graph/1

class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {
        // code here
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                int k=adj.get(i).get(j);
                if(i==k) continue;
                if(i<k){
                    if(map.containsKey(i)) map.get(i).add(k);
                    else {
                        map.put(i,new HashSet<Integer>());
                        map.get(i).add(k);
                    }
                }else{
                    if(map.containsKey(k)) map.get(k).add(i);
                    else {
                        map.put(k,new HashSet<Integer>());
                        map.get(k).add(i);
                    }
                    
                }
            }
        }
        int count=0;
        for(HashSet<Integer> set:map.values()){
            count+=set.size();
        }
        return count;
    }
}
