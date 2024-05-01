package L07_queues.Queue.Question1;

public class main {
    public static void main(String[] args) {
        String readyfruit[] = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<String>(readyfruit);

        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println("Current items: " + fruitQ);
        System.out.println("peek (front item): " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println("Queue at index 2 is: " + fruitQ.getElement(2));
        System.out.println("List contains 'Cherry':" +
                fruitQ.contains("Cherry"));
        System.out.println("List contains 'Durian':" +
                fruitQ.contains("Durian"));

        while(!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }


    }
}
