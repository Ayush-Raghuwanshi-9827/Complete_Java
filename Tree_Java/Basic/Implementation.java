package Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class Implementation {

    public class BTree<E> {
        E data;
        BTree left, right;
    
        public BTree(E data){
            this.data = data;
        }
        
    }
    public static void main(String[] args) {
        
    }
    public static ArrayList <Integer> levelOrder(BTree root) 
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<BTree> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            BTree process = que.poll();
            res.add((Integer) process.data);
            
            if(process.left != null){
                que.offer(process.left);
            }
            if(process.right != null){
                que.offer(process.right);
            }
            
        }   
}