// https://www.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1

class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(b);
        for(int x:a){
            int left=0,right=b.length-1,res=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(b[mid]<=x){
                    res=mid;
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            list.add(res+1);
        }
        return list;
    }
}
