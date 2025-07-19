// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=3&difficulty=Medium,Hard&status=unsolved&sortBy=submissions

// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int left=-1,right=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                left=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                right=i;
                break;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(left);
        list.add(right);
        return list;
    }
}
