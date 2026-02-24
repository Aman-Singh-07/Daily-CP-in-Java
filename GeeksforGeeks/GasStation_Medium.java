// https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1

class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int currGas=0;
        int totalGas=0;
        int index=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            currGas+=gas[i]-cost[i];
            if(currGas<0){
                index=i+1;
                currGas=0;
            }
        }
        if(totalGas<totalCost) return -1;
        return index;
    }
}
