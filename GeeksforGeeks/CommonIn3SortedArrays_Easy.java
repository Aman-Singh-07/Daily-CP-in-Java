// https://www.geeksforgeeks.org/problems/common-elements1132/1?page=3&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int a=arr1.get(i), b=arr2.get(j), c=arr3.get(k);
            if(a==b && c==b){
            if(res.isEmpty() || res.get(res.size()-1)!=a)
                    res.add(a);
                i++; j++; k++;
            }
            else if(a<b)i++;
            else if(b<c)j++;
            else k++;
        }
        if (res.isEmpty()) res.add(-1);
        return res;
        
    }
}
