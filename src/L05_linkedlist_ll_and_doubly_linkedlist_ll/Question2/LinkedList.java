package L05_linkedlist_ll_and_doubly_linkedlist_ll.Question2;

public class LinkedList<E> {
    Node<E> head, tail;
    int size = 0;

    public LinkedList() {}

    public void add(E e) {
        add(size,e);
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        }
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // the new node is the only node in list
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new for element e

        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        }
        else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }

    public void removeElement(E e) {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
                remove(i);
            }
            current = current.next;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        }
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public void printList() {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            System.out.print(current.element);

            if(i==size-1) {
                System.out.print(". ");
            }
            else {
                System.out.print(", ");
            }

            current=current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace(E e, E newE) {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
                current.element = newE;
            }
            current = current.next;
        }
    }

}
