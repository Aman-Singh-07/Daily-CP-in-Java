// https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/?envType=daily-question&envId=2025-07-19

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list=new ArrayList<>();
        String start="";
        for(String path:folder){
            if(list.isEmpty() || !path.startsWith(start+"/")){
                list.add(path);
                start=path;
            }
        }
        
        return list;
    }
}
