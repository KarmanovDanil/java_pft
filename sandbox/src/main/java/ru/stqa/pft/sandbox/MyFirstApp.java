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
  }
}
