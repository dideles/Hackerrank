package Thirty_Days_of_Code.Day_5_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Этот код предназначен для чтения целого числа n из стандартного ввода и вывода таблицы умножения для этого числа от 1 до 10.
 */

public class Solution {
    // Это основной метод main, который является точкой входа в программу.
    public static void main(String[] args) throws IOException {
        /* throws IOException указывает, что в методе может произойти исключение ввода-вывода,
        которое не обрабатывается внутри метода. */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /* Создается объект BufferedReader, который оборачивает объект InputStreamReader,
        который, в свою очередь, читает байты из стандартного ввода (System.in) и преобразует их в символы. */

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        /* Считывается строка из ввода пользователя,
        удаляются пробелы в начале и в конце строки методом trim(),
        и затем строка преобразуется в целое число методом parseInt().
         */

        // // Начинается цикл for, который будет выполняться для значений i от 1 до 10 включительно.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
            /* В каждой итерации цикла выводится строка, показывающая умножение числа n на число i,
            а также результат умножения. */
        } // Закрывается блок цикла for.

        bufferedReader.close(); //Закрывается объект BufferedReader, чтобы освободить ресурсы, связанные с чтением ввода
    } // Закрываются блок метода main.
} // Закрываются блок класса Solution.