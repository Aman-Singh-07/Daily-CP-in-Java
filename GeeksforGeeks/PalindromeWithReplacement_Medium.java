// https://www.geeksforgeeks.org/problems/palindrome-with-minimum-sum--170648/1

class Solution {
    public int minimumSum(String s) {
        // code here
        int count=0;
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                if(ch[i]=='?') ch[i]=ch[j];
                else if(ch[j]=='?') ch[j]=ch[i];
                else return -1;
            }
            i++;
            j--;
        }
        String res=new String(ch);
        while(res.contains("?")){
            res=res.replace("?","");
        }
        for(i=0;i<res.length()-1;i++){
            count+=Math.abs((res.charAt(i)-res.charAt(i+1)));
            //System.out.println(Math.abs((res.charAt(i)-res.charAt(i+1))));
        }
//        System.out.println(res);
        return count;
    }
}
