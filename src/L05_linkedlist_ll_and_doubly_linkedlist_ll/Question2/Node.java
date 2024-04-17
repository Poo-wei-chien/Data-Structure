package L05_linkedlist_ll_and_doubly_linkedlist_ll.Question2;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(E item) {
        element = item;
        next = null;
    }
}