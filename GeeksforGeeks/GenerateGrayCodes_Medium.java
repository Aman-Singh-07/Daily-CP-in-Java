// https://www.geeksforgeeks.org/problems/gray-code-1611215248/1

class Solution {
    public ArrayList<String> generateGrayCodes(int n) {
        // code here
         ArrayList<String> res=new ArrayList<>();
         res.add("0");
         res.add("1");
         for(int i=2;i<=n;i++) {
             int size=res.size();
             for(int j=size-1;j>=0;j--){
                 res.add("1" + res.get(j));
                 res.set(j, "0" +res.get(j));
             }
         }
         return res;
     }
 }
