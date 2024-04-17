package L05_linkedlist_ll_and_doubly_linkedlist_ll.Question1;

public class SList<E> {
    SNode<E> head, tail;
    int size = 0;

    public SList(){
        head = tail = null;
    }

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
        if (size == 0) {
            return null;
        }
        else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public void clear() { //Total : 1m
        size=0;
        head = tail = null;
        System.out.println("List is now empty!");
    }

    public boolean contains(E o) {
        SNode<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o))
                return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        for(SNode<E> tmp=head; tmp!=null; tmp=tmp.next) {
            System.out.println(tmp.element);
        }
    }
}
