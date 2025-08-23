// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?page=3&category=Arrays&status=unsolved&sortBy=submissions

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length<2){
            list.add(-1);
            return list;
        }
        int min1=Math.min(arr[0],arr[1]);
        int min2=Math.max(arr[0],arr[1]);
        for (int i=2;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if(arr[i]<min2 && arr[i]!=min1){
                min2=arr[i];
            }
        }
        
        if(min1==min2){
            list.clear();
            list.add(-1);
        }else{
            list.add(min1);
            list.add(min2);
        }
        
        return list;
    }
}
