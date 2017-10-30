package CrackingTheCode;

import java.util.EmptyStackException;

public class MyStack {

    private static class StackNode {

        private int data;
        private StackNode next;

        public StackNode( int data ){
            this.data = data;
            this.next = null;
        }

        private StackNode top;

        public int pop(){

            if(top == null ) throw new EmptyStackException();
            int item = top.data;
            top = top.next;
            return item;
        }

        public void push (int data ){
            StackNode node = new StackNode( data );
            node.next = top;
            top = node;
        }

        public int peek (){
            if ( top == null ) throw new EmptyStackException();
            return top.data;
        }

        public boolean isEmpty(){
            return top ==null;
        }
    }

}
