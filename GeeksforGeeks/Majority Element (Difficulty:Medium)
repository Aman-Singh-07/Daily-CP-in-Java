// https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions

// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        int count=0;
        int candidate=-1;
        for (int num:arr) {
            if(count==0){
                candidate=num;
                count=1;
            } else if(num==candidate){
                count++;
            } else{
                count--;
            }
        }
        count=0;
        for (int num : arr) {
            if(num==candidate){
                count++;
            }
        }

        return count>arr.length/2?candidate:-1;
    }
}
