// https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=5&status=unsolved&sortBy=submissions

class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        ArrayList<Integer> lx=new ArrayList<>();
        ArrayList<Integer> ly=new ArrayList<>();
        int countX=0;
        int countY=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lx.add(i);
                countX++;
            }
            if(arr[i]==y){
                ly.add(i);
                countY++;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int num1:lx){
            for(int num2:ly){
                min=Math.min(min,Math.abs(num2-num1));
            }
        }
        return (countX>0 && countY>0 && min>0)?min:-1;
    }
}
