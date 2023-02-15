//time and space 0(n) for all 
public class Main{
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(100, 3);
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        list.display();
        list.insertRec(24, 1);
        list.display();

    //     DLL list =new DLL();
    //     list.insertFirst(3);
    //     list.insertFirst(2);
    //     list.insertFirst(8);
    //     list.insertFirst(17);
    //    list.insert(8, 65);
    //     list.insertLast(99);
    //     list.display();

        // CLL list =new CLL();
        // list.insert(3);
        // list.insert(2);
        // list.insert(8);
        // list.insert(17);
        // list.delete(2);
        // list.display();

 }}