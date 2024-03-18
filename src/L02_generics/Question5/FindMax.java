package L02_generics.Question5;

/*compareTo() method:
 * if a > b, it returns positive number
 * if a < b, it returns negative number
 * if a == b, it returns 0
 */

public class FindMax {

    //Create a Circle class that uses the Comparable interface.
    static class Circle implements Comparable<Circle> {
        double radius;  //Declare the radius variable

        //a single parameterized constructor that accepts this variable.
        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle c) {
            if (radius < c.radius)
                return -1;
            else if (radius == c.radius)
                return 0;
            else
                return 1;
        }

        @Override
        public String toString() {
            return "Circle radius: " + radius;
        }
    }

    //The static max method returns the maximum value in an array.
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        //create 3 different objects of type array and invoke the max method
        //integers that stores the following values, 1,2,3;
        Integer[] numbers = {1, 2, 3};
        System.out.println(max(numbers));

        //a list of string that stores red, green, blue
        String[] words = {"red", "green", "blue"};
        System.out.println(max(words));

        //a circle object of radius 3, 2.9 and 5.9.
        Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(circles));

    }

}