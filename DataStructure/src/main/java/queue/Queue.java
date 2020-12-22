package queue;

public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;

    }

    public static void main(String[] args) {

        Queue newQueue = new Queue();
        System.out.print("This queue has "+ newQueue.size + " nodes.");

    }

}