// https://leetcode.com/problems/permutation-sequence/?envType=problem-list-v2&envId=maths-m3-combinatorics-permutations

class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> numbers=new ArrayList<>();
        int[] fact=new int[n+1];
        fact[0]=1;
        for (int i=1;i<=n;i++){
            fact[i]=fact[i-1]*i;
            numbers.add(i);
        }
        k--;
        StringBuilder sb=new StringBuilder();
        for(int i=n;i>=1;i--){
            int index=k/fact[i-1];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k%=fact[i-1];
        }

        return sb.toString();
    }
}
