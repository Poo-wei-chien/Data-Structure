package L01_programming_fundamental.Question1;

import java.io.*;
import java.util.Scanner;

public class readMyLetter {
    public static void main(String[] args) {

        /*
         * TODO: Question 1
         *  1. State the file path of the file you want to read
         *  2. Read the file using the BufferedReader class
         *  3. Print the contents of the file to the console line by line, using the readLine() method
         */

        System.out.println("Reading File from Java code");

        //Name of the file
        String fileName="L1_dummy_files/Rain_12345678.txt"; //file stored at the same level as src folder
        try{
            //Create object of FileReader
            FileReader inputFile = new FileReader(fileName);

            //Instantiate the BufferedReader Class
            BufferedReader bufferReader = new BufferedReader(inputFile);

            //Variable to hold the one line data
            String line;

            // Read file line by line and print on the console
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }

            //Close the buffer reader
            bufferReader.close();

            /*
             * TODO: Question 2
             *  1. Prompt the user to enter the second part of the letter using the Scanner class.
             *  2. Avoid direct copy the text for lab question, else it will only append first row
             *  3. Append the user input to the selected file using the PrintWriter class.
             *  4. Read the file again and print the contents of the file to the console line by line.
             */

            Scanner input = new Scanner(System.in);
            System.out.println("\n\nEnter your second part of the letter :\n");
            String strInput = input.nextLine();

//            PrintWriter output = new PrintWriter(fileName); // this one overwrites existing content only
//            output.println(strInput); //write new string input on file
//            output.close();

            FileWriter outputFile = new FileWriter(fileName, true); // TODO: understand what if the second parameter is false. It will be overwritten.
            BufferedWriter output = new BufferedWriter(outputFile);
            output.write(strInput);
            output.close();

            System.out.println("\n\nAfter user input. String and content in text file.");
            FileReader inputFileAfterAppend = new FileReader(fileName);
            BufferedReader bufferReaderAfterAppend = new BufferedReader(inputFileAfterAppend);

            String line2;
            // Read file line by line and print on the console
            while ((line2 = bufferReaderAfterAppend.readLine()) != null) {
                System.out.println(line2);
            }
            //Close the buffer reader
            bufferReaderAfterAppend.close();

        }catch(Exception e){
            System.out.println("Error while reading file line by line:" +
                    e.getMessage());
        }
    }
}

/**
 * Thursday, 19 March 2021.
 * My name is Rain with matrix number, 12345678. I am
 * majoring in AI. This is my third time taking the
 * Data Structure subject. At the moment, I am feeling excited about taking this
 * subject. This is because useful in future.
 * I acquired A* for my previous Programming 1 course. It’s not too bad. So, I
 * think I can manage to get A* for this DS subject this term. In order
 * to do well in the subject, I will burn the mid night oil. Wish me luck!!!
 *
 *
 * Thursday, 18 June 2021
 *
 * It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did A* in this course. ……….
 */
