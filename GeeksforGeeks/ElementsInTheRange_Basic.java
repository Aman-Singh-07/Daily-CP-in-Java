// https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1

class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int count=0;
        for(int num:arr){
            if(num>=start && num<=end) count++;
        }
        return (end-start+1)==count;
    }
}
