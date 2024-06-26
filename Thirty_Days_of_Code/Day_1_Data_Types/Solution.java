package Thirty_Days_of_Code.Day_1_Data_Types;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
        Enter your code here. Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution.
        */
        int i = 4; // Объявляется целочисленная переменная i и инициализируется значением 4.
        double d = 4.0; // Объявляется переменная с плавающей точкой d и инициализируется значением 4.0.
        String s = "HackerRank "; // Объявляется строковая переменная s и инициализируется строкой "HackerRank ".
        Scanner scan = new Scanner(System.in); // Создается объект scan класса Scanner для чтения ввода с консоли.

        /* Объявляются переменные i2, d2, и s2 для хранения вторых значений
            целого числа, числа с плавающей точкой и строки соответственно. */
        int i2; //
        double d2;
        String s2;
        i2 = scan.nextInt(); // Читается целое число из консоли и присваивается переменной i2.
        d2 = scan.nextDouble(); // Читается число с плавающей точкой из консоли и присваивается переменной d2.
        scan.nextLine(); // Эта строка необходима для очистки буфера ввода, который остался после чтения числа d2,
        // т.к. как nextDouble() не считывает символ новой строки.
        s2 = scan.nextLine(); // Читается строка из консоли и присваивается переменной s2.

        System.out.println(i + i2); // Выводится сумма значений i и i2.
        System.out.println(d + d2); // Выводится сумма значений d и d2.
        System.out.println(s.concat(s2)); // Выводится результат конкатенации строк s и s2.
        /*
        System.out.println(s + s2);

        Использование s.concat(s2) вместо s+s2 в данном контексте является вопросом стиля и предпочтения программиста.

        Обе инструкции выполняют конкатенацию строк, но есть некоторые нюансы:
        1) s.concat(s2) является методом класса String, который создает новую строку путем объединения строки s с строкой s2.
            Этот метод возвращает новую строку, не изменяя исходные строки.
        2) s + s2 использует оператор + для конкатенации строк, который также создает новую строку,
            но может быть более читаемым и простым для понимания, особенно для начинающих программистов.
        В большинстве случаев разработчики предпочитают использовать оператор + для конкатенации строк из-за его простоты и читаемости.

        Однако, если вы работаете с большим количеством строк или в цикле, использование concat может быть предпочтительнее
            с точки зрения производительности,
                т.к. оператор + в цикле может привести к созданию множества временных объектов String,
                    что потенциально может быть менее эффективным.

        В данном случае, разница в производительности будет незначительной, т.к. происходит всего одна операция конкатенации.
        Поэтому можно использовать любой из этих методов в зависимости от предпочтений.
         */
        scan.close(); // Закрывается объект scan класса Scanner.
    }
}