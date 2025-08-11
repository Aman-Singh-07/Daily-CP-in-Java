// https://www.geeksforgeeks.org/problems/three-way-partitioning/1?page=2&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                list1.add(arr[i]);
            }
            else if(arr[i]>=a && arr[i]<=b){
                list2.add(arr[i]);
            }
            else if(arr[i]>b){
                list3.add(arr[i]);
            }
        }
        int k=0;
        for(int num:list1){
            arr[k++]=num;
        }
        for(int num:list2){
            arr[k++]=num;
        }
        for(int num:list3){
            arr[k++]=num;
        }
    }
}
