// https://www.geeksforgeeks.org/problems/relative-sorting4323/1?page=1&category=Searching&status=unsolved&sortBy=submissions

class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a1.length;j++){
                if(a1[j]==a2[i]){
                    list.add(a1[j]);
                    a1[j]=-1;
                }
            }
        }
        
        Arrays.sort(a1);
        for(int i=0;i<list.size();i++){
            a1[i]=list.get(i);
        }
    }
}
