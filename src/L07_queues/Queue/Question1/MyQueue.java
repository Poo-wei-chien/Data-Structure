package L07_queues.Queue.Question1;

public class MyQueue<E> {
    private java.util.LinkedList<E> list
            = new java.util.LinkedList<E>();
    public MyQueue(E[] e) {
        for(int i=0; i<e.length; i++) {
            enqueue(e[i]);
        }
    }
    public MyQueue() {}
    public void enqueue(E e) {
        list.addLast(e);
    }
    public E getElement(int i) {
        return (E) list.get(i);
    }
    public E dequeue() {
        return list.removeFirst();
    }
    public E peek() {
        return list.peek();
    }
    public int getSize() {
        return list.size();
    }
    public boolean contains(E e)
    {
        return list.contains(e);

    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}