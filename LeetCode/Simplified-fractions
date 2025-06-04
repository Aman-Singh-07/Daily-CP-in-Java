// https://leetcode.com/problems/simplified-fractions/

class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<n;i++){
            for(int j=2;j<=n;j++){
                if(gcd(i,j)==1 && i/j<1){
                    list.add(String.valueOf(i+"/"+j));
                }
            }
        }
        return list;
        
    }
    public int gcd(int a,int b) {
    if (b==0)
        return a;
    return gcd(b,a%b);
   }
}
