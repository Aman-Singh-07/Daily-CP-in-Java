// https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

class Solution {
    public static void zigZag(int[] arr) {
        // code here
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            if(i+1<arr.length){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;
            }
        }
        
    }
}
