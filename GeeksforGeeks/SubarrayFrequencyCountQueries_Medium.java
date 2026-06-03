// https://www.geeksforgeeks.org/problems/count-frequency-of-an-element-in-a-given-range/1

class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }else{
                ArrayList<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(arr[i],l);
            }
        }
        for(int i=0;i<queries.length;i++){
            list.add(find(queries[i][0],queries[i][1],queries[i][2],map));
        }
        return list;
        
    }
    public static int find(int l,int r,int x,HashMap<Integer,ArrayList<Integer>> map){
        if(!map.containsKey(x)){
            return 0; 
        }
        ArrayList<Integer> indices = map.get(x);
        int leftPos=Collections.binarySearch(indices,l);
        if (leftPos<0){
            leftPos=-leftPos-1; 
        }
        int rightPos=Collections.binarySearch(indices, r);
        if(rightPos<0){
            rightPos=-rightPos-1; 
        }else{
            rightPos=rightPos+1; 
        }
        return rightPos-leftPos;
    }
}
