// https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1

class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int x=arr[0][0];
        int y=arr[0][1];
        list.add(new int[]{x, y});
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>y){
                x=arr[i][0];
                y=arr[i][1];
                list.add(new int[]{x, y});
            }else{
                if(arr[i][1]>y){
                    y=arr[i][1];
                    list.remove(list.size() - 1);
                    list.add(new int[]{x, y});
                }
            }
        }
        return list;
    }
}
