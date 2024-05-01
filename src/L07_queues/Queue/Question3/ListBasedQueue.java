package L07_queues.Queue.Question3;

public class ListBasedQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E first(){
        return list.peek();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
}
