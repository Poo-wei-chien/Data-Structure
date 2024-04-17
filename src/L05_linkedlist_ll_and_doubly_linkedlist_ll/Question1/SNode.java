package L05_linkedlist_ll_and_doubly_linkedlist_ll.Question1;

public class SNode<E> {
    E element;
    SNode<E> next;

    public SNode() {
        element = null;
        next = null;
    }

    public SNode(E item) {
        element = item;
        next = null;
    }
}
