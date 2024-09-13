package Basic;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class PreOrderTreeTraversal {
    
    class Node{
            int data;
            Node left,right;
            Node(int d){
                data=d;
                left=right=null;
            }
        }
class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    public static void preorder(Node root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.data);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
}
