package L07_queues.Queue.Question2;

import L07_queues.Queue.Question2.MyQueue;

import java.util.Scanner;

public class Palindrome {

    public static void isPalindrome(String a){

        // Create a stack for Character object
        MyQueue<Character> input = new MyQueue<>();

        ////push each character of the String �a� onto the �input� stack
        for (int i=a.length()-1; i>=0; i--){   //change the for loop in stack
            input.enqueue(a.charAt(i));  //replace push() method in stack
        }

        //Create an empty string
        String reverse = "";

        //dequeue all values from the queue and keep all of them in the empty string
        while (!input.isEmpty()){
            reverse += input.dequeue();  //replace pop() method in stack
        }

        //Compare the reverse string with user input string
        if (a.equals(reverse)){
            System.out.println(a+" is a palindrome");
        }else{
            System.out.println(a+" is not a palindrome");
        }

    }

    public static void main(String[] args) {
        System.out.println("--Question 4--");

        //Ask user to input max 15 characters
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = input.next();

        if (str.length()<=15){
            isPalindrome(str);
        }else{
            System.out.println("The string should contains only a maximum characters of 15.");
        }

    }
}
