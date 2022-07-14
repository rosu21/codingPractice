import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionBSTInorder {

    public List<Integer> inorderTraversal(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        while(!stack.isEmpty() || root!=null){

            // go all the way to the left
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //add left most node to output list
            output.add(root.val);

            //go to right tree
            root = root.right;

        }

        return output;




    }
}
