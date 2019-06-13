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

    Square s = new Square(7);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(5,7 );
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }
}
