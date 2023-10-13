import java.util.ArrayList;

public class bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }

    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= insert(root.left, val);
        }
        else{
            root.right= insert(root.right, val);
        }
        return root;

    }
    public static void inOrder (Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data>key){//Left subtree search
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }
        else{//Rigth subtree search
            return search(root.right,key);
       }
    }
    //deleting a Node
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left= delete(root.left, val);
        }else if(root.data<val){
            root.right= delete(root.right, val);
        }else{// root.data==val;
           //Case 1
           if(root.left==null && root.right==null){
            return null;
           }
           //Case 2
           if(root.left==null){
            return root.right;
           }else if(root.right==null){
            return root.left;
           }
           //Case 3
           Node IS=inOrderSuccesor(root.right);
           root.data=IS.data;
           root.right=delete(root.right, IS.data);
          }
           return root;
        }
        public static Node inOrderSuccesor(Node root){
          while (root.left!=null) {
            root=root.left;
          }
          return root;
        }
        //Print in Range X & Y
        public static void PrintInRange(Node root, int X,int Y) {
            if(root==null){
                return;
            }
            if(root.data>=X && root.data<=Y){
                PrintInRange(root.left, X, Y);
                System.out.print(root.data+ " ");
                PrintInRange(root.right, X, Y);
            }
            else if(root.data>=Y){
                PrintInRange(root.left, X, Y);

            }else{
                PrintInRange(root.right, X, Y);
            }
        }

        public static void PrintRootToLeaf(Node root, ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            //Condition for LeafNode
            if(root.left==null && root.right==null){
                printPath(path);
            }else{
            //for non LeafNodes
            PrintRootToLeaf(root.left, path);
            PrintRootToLeaf(root.right, path);
        }
            path.remove(path.size()-1);
        }
    
    private static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
           System.out.print( path.get(i)+"->");
        }
        System.out.println();
        }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14}; //{5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < value.length; i++) {
            root=insert(root, value[i]);
            
        }
        inOrder(root); //O(H) or log(n)
            System.out.println();
            delete(root, 4);
            inOrder(root);;
            System.out.println();
            
            if(search(root, 6)){   //O(H)
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
            PrintInRange(root, 6, 10);
            System.out.println();
            PrintRootToLeaf(root, new ArrayList<>());
    }
}
