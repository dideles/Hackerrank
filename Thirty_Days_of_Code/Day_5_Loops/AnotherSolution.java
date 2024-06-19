package Thirty_Days_of_Code.Day_5_Loops;

import java.util.Scanner;

/*
Этот код предназначен для чтения целого числа n из стандартного ввода и вывода таблицы умножения для этого числа от 1 до 10.
 */

public class AnotherSolution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        scanner.close();
    }
}