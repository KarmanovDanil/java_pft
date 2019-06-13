package ru.stqa.pft.sandbox;/*
Это пример простой программы на Java.
Присвойте файлу с исходным кодом имя Example.java.
*/

public class MyFirstApp {
  // Выполнение любой программы на Java начинается
  // с вызова метода main()
  public static void main (String[] args) {
    System.out.println ("Я управляю");
    System.out.println("миром");
    System.out.println("как никто");

    // Выражения и операции
    System.out.println(2 + 2);
    System.out.println(2 * 2);
    System.out.println(2 / 2);
    System.out.println(2 - 2);

    System.out.println(1 / 2);
    System.out.println(1.0 / 2);
    System.out.println(1 / 2.0);
    System.out.println(2.0 / 2);

    System.out.println("2" + "2 ");
    System.out.println("2" + 2);
    System.out.println(2 + "2");

    System.out.println(2 + 2 * 2);
    System.out.println((2 + 2) * 2);

    System.out.println("2 + 2  = " + (2 + 2));

    //Переменные и значения
    //Значения - кусочек данных, которых хранится в памяти компьютера
    //Литеральные значения - явно описаны в коде программы
    //Вычислимые значения - результат вычисления какого-то выражения (склеивание строк или ариф.операция)
    //Переменная - идентификатор, который ссылается на значение, хранящиеся в памяти компьютера
    int l = 6;
    int s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + " = " + s);


  }
}
