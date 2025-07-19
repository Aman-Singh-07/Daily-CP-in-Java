// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?page=2&sortBy=submissions

// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        HashSet<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                set.add(a[i]);
                i++;
            }
            else if(b[j]<a[i]){
                set.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            set.add(a[i]);
            i++;
        }
        while(j<b.length){
            set.add(b[j]);
            j++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }
        Collections.sort(list);
        return (list);
    }
}
