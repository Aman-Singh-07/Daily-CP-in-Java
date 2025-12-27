// https://leetcode.com/problems/merge-intervals/description/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        boolean[] isTrue=new boolean[intervals.length];
        int k=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[k][1]>=intervals[i][0] && isTrue[k]==false && intervals[i][1]<intervals[k][1]){
                isTrue[i]=true;
            }
            else if(intervals[k][1]>=intervals[i][0] && isTrue[k]==false){
                intervals[k][1]=intervals[i][1];
                isTrue[i]=true;
            }
            else{
                k=i;
            }
        }
        int count=0;
        for(int i=0;i<isTrue.length;i++){
            if(isTrue[i]==false) count++;
        }
        int[][] res=new int[count][2];
        k=0;
        for(int i=0;i<intervals.length;i++){
            if(isTrue[i]==false){
                res[k][0]=intervals[i][0];
                res[k][1]=intervals[i][1];
                k++;
            }
        }
        return res;
    }
}
