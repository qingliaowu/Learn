package Linkedlist;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class nLastNode {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList();
        ll.printList();
        Node n = nthLastNode(ll, 9);
        System.out.print(n.data);
    }

    public static Node nthLastNode(LinkedList list, int n) {
        // Create your method here:
        Node current = null;
        Node tailSeeker = list.head;
        int count = 0;

        while (tailSeeker != null) {
            tailSeeker = tailSeeker.getNextNode();
            if (count >= n) {
                if (current == null) {
                    current = list.head;
                }
                current = current.getNextNode();
            }
            count++;
        }
        return current;
    }

    public static LinkedList createList() {
        LinkedList list = new LinkedList();
        for (int i = 50; i >= 1; i--) {
            list.addToTail(valueOf(i));
        }
        return list;
    }

}