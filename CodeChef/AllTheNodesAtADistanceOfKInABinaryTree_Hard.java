// https://www.codechef.com/problems/KDISTANCETRE

// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) {
//         val = x;
//         left = right = null;
//     }
// }

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // write your code here
        List<Integer> list=new ArrayList<>();
        if(root==null || target==null) return list;
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        find(root,null,map);
        Queue<TreeNode> queue=new LinkedList<>();
        HashSet<TreeNode> set=new HashSet<>();
        queue.add(target);
        set.add(target);
        int j=0;
        while(!queue.isEmpty()){
            if(j==k){
                while(!queue.isEmpty()){
                    list.add(queue.poll().val);
                }
                return list;
            }
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null && !set.contains(temp.left)){
                    set.add(temp.left);
                    queue.add(temp.left);
                }
                if(temp.right!=null && !set.contains(temp.right)){
                    set.add(temp.right);
                    queue.add(temp.right);
                }
                TreeNode node=map.get(temp);
                if(node!=null && !set.contains(node)){
                    set.add(node);
                    queue.add(node);
                }
                
            }
            j++;
        }
        return list;
        
    }
    public void find(TreeNode node,TreeNode root,HashMap<TreeNode,TreeNode> map){
        if(node==null) return;
        if(root!=null) map.put(node,root);
        find(node.left,node,map);
        find(node.right,node,map);
    }

}
