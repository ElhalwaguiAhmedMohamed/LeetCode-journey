/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public IList<int> InorderTraversal(TreeNode root) {
        IList<int> treeList = new List<int>();
        helper(root,treeList);
        return treeList;
    }
    
    public void helper(TreeNode node, IList<int> treeList){
        if(node != null){
            helper(node.left,treeList);
            treeList.Add(node.val);
            helper(node.right,treeList);
        }
        
    }
}