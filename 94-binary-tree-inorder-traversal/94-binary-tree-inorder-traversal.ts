/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function inorderTraversal(root: TreeNode | null): number[] {
    let treeList: number[] = [];
    inorderHelper(root,treeList);
    return treeList;
    
};

function inorderHelper(node:TreeNode | null , treeList: number[]):number[]{
     if(!node)
        return [];
    inorderHelper(node.left,treeList); // left branch
    treeList.push(node.val)
    inorderHelper(node.right,treeList); //right branch
  
};