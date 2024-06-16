package Thirty_Days_of_Code.Day_0_Hello_World;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        /* Read a full line of input from stdin and save it to our variable, inputString.*/
        String inputString = scan.nextLine();
        /* Close the scanner object because we've finished reading all of the input from stdin needed for this challenge.*/
        scan.close();
        /* Print a string literal saying "Hello, World." to stdout.*/
        System.out.println("Hello, World.");
        /* Print the contents of inputString to stdout.*/

        /* Solution starts from here */
        System.out.println(inputString);
    }
}