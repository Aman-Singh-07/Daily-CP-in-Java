// https://www.geeksforgeeks.org/problems/find-marks-from-ranks/1

class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            for(int j=l[i];j<=r[i];j++){
                list.add(j);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<rank.length;i++){
            res.add(list.get(rank[i]-1));
        }
        return res;
    }
}
