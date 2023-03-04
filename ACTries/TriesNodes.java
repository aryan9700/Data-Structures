//insert time complexity 0(length of largest element/L) eg: 0(5)
public class TriesNodes {
    private static int ALPHABET_SIZE =26;

   static class Node{
    Node[] children;
    boolean eow;
   public Node(){
    children=new Node[ALPHABET_SIZE];
    for (int i = 0; i < ALPHABET_SIZE; i++) {
        children [i]=null;
    }
    eow=false;
   }
   }
   static Node root=new Node();
   public static void insert(String word){
    for (int i = 0; i < word.length(); i++) {//0(L)
        int idx=word.charAt(i)-'a';// 'a'-'a'=0 , 'b'-'a'=1 ,'z'-'a'=25;

        if (root.children[idx]==null) {
            root.children[idx]=new Node();
        }
        root=root.children[idx];
    }

   }

   public static void main(String[] args) {
    String words[] ={"the","there","their","a","any"};
   }
}
