// https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        if(set.size()<2){
            return -1;
        }
        int[] arr2=new int[set.size()];
        int j=0;
        for(int i:set){
            arr2[j]=i;
            j++;
        }
        int largest=Math.max(arr2[0],arr2[1]);
        int secondLargest=Math.min(arr2[0],arr2[1]);
        for(int i=2;i<arr2.length;i++){
            if(arr2[i]>largest){
                secondLargest=largest;
                largest=arr2[i];
            }
            else if(arr2[i]>secondLargest && arr2[i]!=largest){
                secondLargest=arr2[i];
            }
        }
        return secondLargest;
    }
}
