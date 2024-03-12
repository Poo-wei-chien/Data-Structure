package L01_programming_fundamental.Question2;

//Read text1.txt (character separated by comma)

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class readText1File {
    public static void main(String[] args) {

        /*
         * TODO: Question 2a
         *  1. Use "StringTokenizer" / ".split()" to split the characters in each line of the file
         *  2. Count the number of string after splitting
         *
         * TODO: Question 2b
         *  1. Use "StringTokenizer" / ".split()" to split the characters in each line of the file
         *  2. Print the string after without the special characters
         */

        String fileName="L1_dummy_files/text1.txt";
        System.out.println("Reading File from text file : " + fileName + "\n");
        try{
            //Create object of FileReader
            FileReader inputFile = new FileReader(fileName);
            //Instantiate the BufferedReader Class
            BufferedReader bufferReader = new BufferedReader(inputFile);
            //Variable to hold the one line data
            String line;
            int counter=0;
            // Read file line by line and print on the console
            while ((line = bufferReader.readLine()) != null) {
                System.out.println("Line " + (counter+1) + " is : " + line);
                // StringTokenizer st = new StringTokenizer(line);

                //Approach 1
                System.out.println("Split by comma using StringTokenizer:");
                StringTokenizer st2 = new StringTokenizer(line, ",");
                int numOfChar = 0;
                while(st2.hasMoreElements()) {
                    System.out.println(st2.nextElement());
                    numOfChar++;
                }
                System.out.println("Number of characters: "+ numOfChar+"\n");

//                Approach 2 - recommended
                System.out.println("Split by comma using split method:");
                String[] tokens = line.split(","); // ["S,U,C,E,S,S"] become ["S", "U", "C", "E", "S", "S"]
                int tokenCount = tokens.length;
                for (int j = 0; j < tokenCount; j++) {
                    System.out.println(tokens[j]);
                }
                System.out.println("Number of characters : " + tokenCount+"\n");
                counter++;
            }
            bufferReader.close();//Close the buffer reader
        }catch(Exception e){
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
    }
}
