package Thirty_Days_of_Code.Day_4_Class_vs_Instance;

import java.util.Scanner;

/*
Этот код представляет собой решение задачи,
    в которой необходимо определить, является ли человек молодым, подростком или старым, исходя из его возраста,
        а затем показать, как эта классификация меняется после трех лет.
 */

public class Person { // Объявляется публичный класс Person.
    private int age; // В классе Person объявляется приватное поле age, которое хранит возраст человека.

    public Person(int initialAge) { // Это конструктор класса Person, который принимает один параметр initialAge — начальный возраст.
        // Add some more code to run some checks on initialAge
        if (initialAge > 0) { // В конструкторе проверяется, что начальный возраст больше нуля.
            age = initialAge; // Если это так, то поле age инициализируется значением initialAge
        } else { // В противном случае выводится сообщение об ошибке, и возраст устанавливается равным нулю.
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

    public void amIOld() { // Метод amIOld определяет, старый ли человек, и выводит соответствующее сообщение.
        // Write code determining if this person's age is old and print the correct statement:

        // В зависимости от возраста, метод amIOld выводит одно из трех сообщений: "You are young.", "You are a teenager." или "You are old.".
        if (age < 13) System.out.println("You are young.");
        else if (age < 18) System.out.println("You are a teenager.");
        else System.out.println("You are old.");
        // System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() { // Метод yearPasses увеличивает возраст человека на один год.
        // Increment this person's age.
        age++; // Эта строка увеличивает значение поля age на единицу.
    }

    public static void main(String[] args) { // Метод main — точка входа в программу.
        Scanner sc = new Scanner(System.in); // Создается объект Scanner для чтения данных из консоли.
        int T = sc.nextInt(); // Читается первое число из консоли, которое указывает количество тестовых случаев.
        for (int i = 0; i < T; i++) { // Начинается цикл, который будет выполняться T раз.
            int age = sc.nextInt(); // Для каждого тестового случая читается возраст.
            Person p = new Person(age); // Создается новый объект Person с прочитанным возрастом.
            p.amIOld(); // Вызывается метод amIOld для объекта p.
            for (int j = 0; j < 3; j++) { // В течение трех лет
                p.yearPasses(); // вызывается метод yearPasses для объекта p.
            }
            p.amIOld(); // Снова вызывается метод amIOld для объекта p, чтобы увидеть, как изменилось его состояние после трех лет.
            System.out.println(); // Выводится пустая строка для разделения вывода между разными тестовыми случаями.
        }
        sc.close(); // Цикл завершается, и объект Scanner закрывается.
    }
}