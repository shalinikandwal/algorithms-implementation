package CrackingTheCode;

public class Node {
    int data;
    Node next = null;

    public Node( int x) {
        this.data = x;
    }

    void appendToTail( int data ){
        Node end = new Node(data);
        Node n = this;

        while (n != null ){
            n = n.next;
        }
        n.next = end;
    }
}
