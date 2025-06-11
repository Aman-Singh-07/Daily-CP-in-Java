// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=2&sortBy=submissions

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean isTrue=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    list.add(arr[j]);
                    isTrue=true;
                    break;
                }
            }
            if(!isTrue) list.add(-1);
        }
        return list;
    }
}
