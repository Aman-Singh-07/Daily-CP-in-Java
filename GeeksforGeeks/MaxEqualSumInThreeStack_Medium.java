// https://www.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1

class Solution {
    public int maxEqualSum(ArrayList<Integer> s1, ArrayList<Integer> s2,
                           ArrayList<Integer> s3) {
        // code here
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        
        a1.add(s1.get(s1.size()-1));
        a2.add(s2.get(s2.size()-1));
        a3.add(s3.get(s3.size()-1));
        int j=1;
        for(int i=s1.size()-2;i>=0;i--){
            a1.add(a1.get(j-1)+s1.get(i));
            j++;
        }
        j=1;
        for(int i=s2.size()-2;i>=0;i--){
            a2.add(a2.get(j-1)+s2.get(i));
            j++;
        }
        j=1;
        for(int i=s3.size()-2;i>=0;i--){
            a3.add(a3.get(j-1)+s3.get(i));
            j++;
        }
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num:a2) set1.add(num);
        for(int num:a3) set2.add(num);
        int max=0;
        for(int i=0;i<a1.size();i++){
            if(set1.contains(a1.get(i)) && set2.contains(a1.get(i))){
                max=Math.max(max,a1.get(i));
            }
        }
        return max;
    }
}
