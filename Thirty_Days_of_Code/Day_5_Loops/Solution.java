package Thirty_Days_of_Code.Day_5_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Этот код предназначен для чтения целого числа n из стандартного ввода и вывода таблицы умножения для этого числа от 1 до 10.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        bufferedReader.close();
    }
}