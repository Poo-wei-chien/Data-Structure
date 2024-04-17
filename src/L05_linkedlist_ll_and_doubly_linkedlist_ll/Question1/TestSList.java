package L05_linkedlist_ll_and_doubly_linkedlist_ll.Question1;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        list.appendEnd("linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        System.out.println("The removed word is " + list.removeInitial());
        System.out.println("Does the list contain the word 'difficult'? " + list.contains("difficult"));
        list.clear();
    }
}
