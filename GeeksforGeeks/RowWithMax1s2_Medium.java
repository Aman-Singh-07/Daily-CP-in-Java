// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1


class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0;
        int index=-1;
        int i=0;
        for(int[] row:arr){
            int count=0;
            for(int num:row) if(num==1) count++;
            
            if(count>max){
                max=count;
                index=i;
            }
            i++;
        }
        return index;
    }
}
