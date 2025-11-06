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
    int preInd=0;
    public TreeNode helper(int preorder[],int inorder[],int start,int end,Map<Integer,Integer>map){
        if(start>end)return null;
        int rootVal=preorder[preInd++];
        TreeNode root=new TreeNode(rootVal);
        int inIndex=map.get(rootVal);
        root.left=helper(preorder,inorder,start,inIndex-1,map);
        root.right=helper(preorder,inorder,inIndex+1,end,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       
        HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
       return helper(preorder,inorder,0,inorder.length-1,map);
    }
}