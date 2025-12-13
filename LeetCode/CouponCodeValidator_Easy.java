// https://leetcode.com/problems/coupon-code-validator/description/?envType=daily-question&envId=2025-12-13

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> list=Arrays.asList("electronics", "grocery", "pharmacy","restaurant");
        Map<String,List<String>> map=new HashMap<>();
        for(String s:list){
            map.put(s,new ArrayList<>());
        }
        for(int i=0;i<code.length;i++){
            if(isActive[i] && isValidCode(code[i]) && map.containsKey(businessLine[i])){
                map.get(businessLine[i]).add(code[i]);
            }
        }
        List<String> result=new ArrayList<>();
        for(String s:list){
            List<String> coupons=map.get(s);
            Collections.sort(coupons);
            result.addAll(coupons);
        }
        
        return result;
    }
    public static boolean isValidCode(String s){
        if(s==null || s.isEmpty()) return false;
        for(char c:s.toCharArray()) {
            if(!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }
        return true;
    }
}
