package CrackingTheCode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListNode {

    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }

    }

    static void deletedups( Node node ){
        Node previous = null;
        Set<Integer> set = new HashSet<Integer>();

        while ( node != null ){

            if( ! set.contains(node.data)){
                set.add(node.data);
                previous = node;
            }else {
                previous.next = node.next;
            }
            node = node.next;
        }
    }

    static void printList( Node head){
        while(head != null){
            System.out.println(head.data + "  ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);
        deletedups(start);
        printList(start);
    }
}
