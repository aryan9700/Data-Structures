package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue=new CustomQueue();
        CircularQueue queue=new CircularQueue(5);
        queue.insert(24);
        queue.insert(25);
        queue.insert(26);
        queue.insert(27);
        queue.insert(28);
queue.display();
        System.out.println(queue.remove());
        queue.insert(29);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(33);
        queue.display();
    }
}
