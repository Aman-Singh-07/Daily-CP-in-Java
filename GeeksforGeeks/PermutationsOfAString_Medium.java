// https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?page=2&status=unsolved&sortBy=submissions

import java.util.*;

class Solution {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> result=new ArrayList<>();
        permute(s.toCharArray(),0,s.length()-1,result);
        HashSet<String> set=new HashSet<>();
        for(String str:result){
            set.add(str);
        }
        ArrayList<String> res=new ArrayList<>();
        for(String str:set){
            res.add(str);
        }
        return res;
    }

    private void permute(char[] arr,int l,int r,ArrayList<String> result){
        if(l==r){
            result.add(new String(arr));
        }else{
            for(int i=l;i<=r;i++){
                swap(arr,l,i);
                permute(arr,l+1,r,result);
                swap(arr,l,i);
            }
        }
    }

    private void swap(char[] arr,int i,int j) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
