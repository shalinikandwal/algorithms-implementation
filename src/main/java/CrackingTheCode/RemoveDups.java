package CrackingTheCode;

public class RemoveDups {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node( int d) {
            this.data = d;
            this.next = null;
        }

    }
    static void deleteDups(Node head) {
        Node current = head;
        while (current != null) {
            /* Remove all future nodes that have the same value */
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
             current = current.next;
        }
    }
}
