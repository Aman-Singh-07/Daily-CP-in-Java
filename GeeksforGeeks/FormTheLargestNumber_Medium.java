// https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] st=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            st[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(st,(a,b)->(b+a).compareTo(a+b));
        if(st[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length;i++){
            sb.append(st[i]);
        }
        return sb.toString();
       
        
    }
    
}
