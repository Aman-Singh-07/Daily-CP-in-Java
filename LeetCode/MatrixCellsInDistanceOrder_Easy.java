// https://leetcode.com/problems/matrix-cells-in-distance-order/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                list.add(j);
                l.add(list);
            }
        }
        Collections.sort(l,(a,b)->{
            int distA=Math.abs(a.get(0)-rCenter)+Math.abs(a.get(1)-cCenter);
            int distB=Math.abs(b.get(0)-rCenter)+Math.abs(b.get(1)-cCenter);
            return Integer.compare(distA,distB);
        });

        int[][] arr=new int[rows*cols][2];
        for(int i=0;i<l.size();i++){
            arr[i][0]=l.get(i).get(0);
            arr[i][1]=l.get(i).get(1);
        }
        return arr;
        
    }
}
