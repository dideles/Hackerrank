package Thirty_Days_of_Code.Day_3_Intro_to_Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /* Создание объекта BufferedReader, который оборачивает InputStreamReader, который, в свою очередь,
        оборачивает стандартный ввод системы (System.in). Это позволяет считывать текст из потока ввода. */

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        /* Считывание строки из ввода пользователя, удаление пробелов в начале и в конце строки методом trim()
        и преобразование результата в целое число. */

        /*if (N % 2 == 0) { // Проверка, является ли число N чётным.
            if (N >= 2 && N <= 5) // Если N чётное и находится в диапазоне от 2 до 5, выводится "Not Weird".
                System.out.print("Not Weird");
            else if (N >= 6 && N <= 20) // Если N чётное и находится в диапазоне от 6 до 20, выводится "Weird".
                System.out.print("Weird");
            else // Если N чётное и больше 20, выводится "Not Weird".
                System.out.print("Not Weird");
        } else // Если N нечётное, выводится "Weird".
            System.out.print("Weird");*/

        System.out.print((N % 2 == 1 || (N >= 6 && N <= 20)) ? "Weird" : "Not Weird");

        bufferedReader.close(); // Закрытие объекта BufferedReader для освобождения ресурсов.
    }
}