import java.util.concurrent.atomic.AtomicInteger;
import trees.TreeNode;

class BinaryTreeDiameter {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        
        return Math.max( leftHeight + rightHeight, Math.max(leftD, rightD) );
    }
    
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if( leftHeight > rightHeight ) {
            return leftHeight+1;
        } else {
            return rightHeight+1;
        }
    }
}
