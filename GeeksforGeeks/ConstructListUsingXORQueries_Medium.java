// https://www.geeksforgeeks.org/problems/construct-list-using-given-q-xor-queries/1

class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        ArrayList<Integer> res = new ArrayList<>();
        int xor = 0;
        
        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int val = queries[i][1];
            
            if (type == 0) {
                res.add(val ^ xor);
            } else {
                xor ^= val;
            }
        }
        
        res.add(0 ^ xor); 
        Collections.sort(res);
        
        return res;
    }
}
