// https://www.geeksforgeeks.org/problems/sort-last-m-elements--155156/1?page=5&difficulty=Medium&status=unsolved&sortBy=accuracy

class Solution {
    public void sortLastMelements(int[] nums, int n, int m) {
        // Code here
        int[] nums2=new int[m];
        int k=0;
        for(int i=n;i<m+n;i++){
            nums2[k++]=nums[i];
        }
        k=0;
        Arrays.sort(nums2);
        for(int i=n;i<m+n;i++){
            nums[i]=nums2[k++];
        }
    }
}
