// https://www.geeksforgeeks.org/problems/generate-permutations-of-an-array/1

class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        permute(arr,0,l);
        return l;
    }
    public static void permute(int[] arr,int start, ArrayList<ArrayList<Integer>> res){
        if(start==arr.length){
            ArrayList<Integer> l=new ArrayList<>();
            for(int num:arr){
                l.add(num);
            }
            res.add(l);
        }
        for(int i=start;i<arr.length;i++){
            swap(arr,start,i);
            permute(arr,start+1,res);
            swap(arr,start,i);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
};
