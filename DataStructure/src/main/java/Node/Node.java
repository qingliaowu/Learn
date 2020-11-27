package Node;

public class Node {

    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {

        Node strawberry = new Node("Berry Tasty");
        Node banana = new Node("Banana-rama");
        Node coconut = new Node("Nuts for Coconut");

        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);

    }

}