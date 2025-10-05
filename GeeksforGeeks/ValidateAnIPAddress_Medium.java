// https://www.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1?page=3&status=unsolved&sortBy=submissions

class Solution {
    public boolean isValid(String s) {
        String[] parts=s.split("\\.");
        if(parts.length!=4) return false;
        for(String part:parts){
            if(part.isEmpty()) return false;
            for(char c:part.toCharArray()){
                if(!Character.isDigit(c)) return false;
            }
            if(part.length()>1 && part.charAt(0)=='0') return false;
            int num=Integer.parseInt(part);
            if(num<0 || num>255) return false;
        }
        return true;
    }
}
