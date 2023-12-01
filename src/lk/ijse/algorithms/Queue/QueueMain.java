package lk.ijse.algorithms.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.deQueue();

        int peek = queue.peek();
        System.out.println(peek);

        queue.print();
    }
}
