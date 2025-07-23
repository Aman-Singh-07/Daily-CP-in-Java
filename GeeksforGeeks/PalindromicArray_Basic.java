// https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=7&status=unsolved&sortBy=submissions

/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            if(!palindrome(arr[i])) return false;
        }
        return true;
        
    }
    public static boolean palindrome(int n){
        int temp=n;
        int res=0;
        while(temp>0){
            int r=temp%10;
            res=res*10+r;
            temp/=10;
        }
        return res==n;
    }
}
