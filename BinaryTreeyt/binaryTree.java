package BinaryTreeyt;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BT{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
 
        }
    }
    public static void preOrder(Node root){
        if(root==null){
           return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root==null){
            return;
         }
         inOrder(root.left);
         System.out.print(root.data+" ");
         inOrder(root.right);
     }
     public static void postOrder(Node root) {
        if(root==null){
            return;
         }
         postOrder(root.left);
         postOrder(root.right);
         System.out.print(root.data+" ");
     }
     public static void levelOrder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }           
        }
     }
     public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countNode(root.left);
        int rightNode=countNode(root.right);

        return rightNode + leftNode + 1;
     }
     public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumOfNode(root.left);
        int rightsum=sumOfNode(root.right);

        return leftsum + rightsum + root.data;
     }
     public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
     }
     public static int diameter(Node root){
        if(root==null){
            return 0;
        }
       int diam1=diameter(root.left);
       int diam2=diameter(root.right);
       int diam3= height(root.left) + height(root.right) + 1;

       return Math.max(diam3,(Math.max(diam1, diam2)));

     }
     static class treeInfo{
        int ht;
        int diam;

        treeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;

        }
     }
     public static treeInfo diameter2(Node root){
        if(root==null){
            return new treeInfo(0, 0);
        }
        treeInfo left=diameter2(root.left);
        treeInfo right=diameter2(root.right);

        int myHeight=Math.max(left.ht, right.ht) + 1;

        int diam1= left.diam;
        int diam2=right.diam;
        int diam3=left.ht + right.ht + 1;

        int myDiam=Math.max(diam1,Math.max(diam2, diam3));

        treeInfo myInfo=new treeInfo(myHeight, myDiam);
        return myInfo;

     }
     
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BT tree= new BT();
       Node root=tree.buildTree(nodes);
        //  System.out.println(root.data);
    // preOrder(root);
    // inOrder(root); // O(N)
    // postOrder(root); //O(N)
    // levelOrder(root); //O(N)
        //  System.out.println(countNode(root)); //O(N)
        //  System.out.println(sumOfNode(root)); //O(N)
        //  System.out.println(height(root));
        //  System.out.println(diameter(root));//O(N^2)
        System.out.println(diameter2(root).diam);//O(N) better complexity  to find diameter

    }
}
