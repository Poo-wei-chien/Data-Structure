package L03_adts_and_bags.Question1_5;


public class ArrayBagDemo {

    public static void main(String[] args) {
        /* Create two (2) empty ArrayBag objects of the type array for
         * a list of strings, named bag1, bag2 */
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();

        /* Then filling an initially empty bag, bag1 ad bag2 with
         * a list of strings using the method testAdd
         * Display the contents of bag1 and bag2 using method displayBag */

        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

        System.out.println("bag1:");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);

        System.out.println("\nbag2:");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);

        /*Test the method union using a new bag named bag3
         * that combines the contents of bag1 and bag2.
         * Display the contents of bag3 using method displayBag.
         */
        System.out.println("\nbag3, test the method union +"
                + "of bag1 and bag2:");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);

        System.out.println("\nbag4, test the method intersection +"
                + "of bag1 and bag2:");
        /*Test the method intersection using a new bag named bag4
         * that contains those objects that occur in both bag1 and bag2.
         * Display the contents of bag4 using method displayBag.
         */
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);

        System.out.println("\nbag5, test the method difference "
                + "+ of bag1 and bag2:");
        /*Test the method difference using a new bag named bag5
         * that create a new bag of objects that would be left in bag1
         * after removing those that also occur in bag2.
         * Display the contents of bag5 using method displayBag.
         */
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);

    }

    // Tests the method add.
    private static void testAdd(BagInterface<String> aBag, String[] content)
    {
        System.out.print("Adding ");
        for (int index = 0; index < content.length; index++)
        {
            aBag.add(content[index]);
            System.out.print(content[index] + " ");
        } // end for
        System.out.println();

    } // end testAdd


    // Tests the method toArray while displaying the bag.
    private static void displayBag(BagInterface<String> aBag)
    {
        System.out.println("The bag contains " + aBag.getCurrentSize() +
                " string(s), as follows:");
        Object[] bagArray = aBag.toArray();
        for (int index = 0; index < bagArray.length; index++)
        {
            System.out.print(bagArray[index] + " ");
        } // end for

        System.out.println();
    } // end displayBag

}// end ArrayBagDemo

/*Console Output:
 bag1
Adding A A B A C A
The bag contains 6 string(s), as follows:
A A B A C A

bag2:
Adding A B A C B C D another string
The bag contains 8 string(s), as follows:
A B A C B C D another string

bag3, test the method union of bag1 and bag2:
The bag contains 14 string(s), as follows:
A A B A C A A B A C B C D another string

bag4, test the method intersection of bag1 and bag2:
The bag contains 4 string(s), as follows:
A A B C

bag5, test the method difference of bag1 and bag2:
The bag contains 2 string(s), as follows:
A A

 */
