package ru.stqa.pft.sandbox;/*
Это пример простой программы на Java.
Присвойте файлу с исходным кодом имя Example.java.
*/

public class MyFirstApp {
  // Выполнение любой программы на Java начинается
  // с вызова метода main()
  public static void main (String[] args) {
    hello("world");
    hello("user");
    hello("Danil");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

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
    double l = 6.0;
    double s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + " = " + s);



  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }

  public static double area (double r) {
    return  r * r;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}
