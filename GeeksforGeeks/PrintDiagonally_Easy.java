// https://www.geeksforgeeks.org/problems/print-diagonally4331/1

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(map.containsKey((i+j))){
                    map.get((i+j)).add(mat[i][j]);
                }else{
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(mat[i][j]);
                    map.put(i+j,temp);
                }
            }
        }
        for(ArrayList<Integer> l:map.values()){
            for(int num:l) list.add(num);
        }
        return list;
    }
}
