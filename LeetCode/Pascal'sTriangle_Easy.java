// https://leetcode.com/problems/pascals-triangle/description/?envType=daily-question&envId=2025-08-01

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> l=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            ArrayList<Integer> n=new ArrayList<>();
            int x=1;
            for(int j=0;j<=i;j++){
                n.add(x);
                x=x*(i-j)/(j+1);

            }
            l.add(n);
        }
        return l;
        
    }
}
