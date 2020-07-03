/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
       if(root==null)return new ArrayList();
            List<List<Integer>>res=new ArrayList();
            Queue <TreeNode>queue=new LinkedList();
            queue.add(root);
            while(!queue.isEmpty())
            { List<Integer> newList= new ArrayList();
              int count=queue.size();
               while(count-- >0) 
               {        root=queue.poll();
                        newList.add(root.val);
                        if(root.left!=null) queue.add(root.left);
                        if(root.right!=null)queue.add(root.right);
               }res.add(newList);
            }
       Collections.reverse(res);
       return res;
        }
        
       
}
