// https://www.geeksforgeeks.org/problems/farthest-smaller-right/1

class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        ArrayList<Integer> listIndex=new ArrayList<>();
        ArrayList<Integer> listNum=new ArrayList<>();
        int n=arr.length;
        int min=arr[n-1];
        listIndex.add(n-1);
        int index=n-1;
        listNum.add(min);
        for(int i=arr.length-1;i>0;i--){
            if(min<arr[i-1]){
                if(!listIndex.contains(index)){
                    listIndex.add(index);
                    listNum.add(min);
                }
            }
            else if(arr[i-1]<min){
                min=arr[i-1];
                index=i-1;
                if(!listIndex.contains(index)){
                    listIndex.add(index);
                    listNum.add(min);
                }
            }
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean isTrue=false;
            for(int j=0;j<listIndex.size();j++){
                if(arr[i]>listNum.get(j) && i<listIndex.get(j)){
                    res.add(listIndex.get(j));
                    isTrue=true;
                    break;
                }
            }
            if(!isTrue){
                res.add(-1);
            }
        }
        return res;
    }
}
