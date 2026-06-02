// https://www.codechef.com/problems/SERIALANDDES?tab=statement

// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int x) {
//         val = x;
//         left = right = null;
//     }
// }

static TreeNode deserialize(int[] arr) {
    // write your code here 
    if(arr==null || arr.length==0) return null;
    if(arr[0]==-1) return null;
    TreeNode root=new TreeNode(arr[0]);
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    int i=1;
    while(!queue.isEmpty() && i<arr.length){
        TreeNode temp=queue.poll();
        if(i<arr.length && arr[i]!=-1){
            temp.left=new TreeNode(arr[i]);
            queue.add(temp.left);
        }
        i++;
        if(i<arr.length && arr[i]!=-1){
            temp.right=new TreeNode(arr[i]);
            queue.add(temp.right);
            
        }
        i++;
    }
    return root;
    
    
    
}


static List<Integer> serialize(TreeNode root) {
    // write your code here 
    List<Integer> list=new ArrayList<>();
    if(root==null){
        return list;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int len=queue.size();
        for(int i=0;i<len;i++){
            TreeNode node=queue.poll();
            if(node==null) list.add(-1);
            else{
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }
    int i=list.size()-1;
    while(i>=0 && list.get(i)==-1){
        list.remove(i);
        i--;
    }
    return list;
    
}
