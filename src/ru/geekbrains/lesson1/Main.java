package ru.geekbrains.lesson1;

public class Main {
  public static void main(String[] args) {
    byte a = 10;
    short b = 10000;
    int c = 1000000000;
    long d = 10000000000000000L;
    float e = 0.75f;
    double f = 70000000.5443;
    char j = 'b';
    boolean h = true;
    String k = "здарова";
    count(2f, 3f, 4f, 5f);
    checkValue(20);
    checkValue(50);
    printSign(1);
    printSign(-1);
    isNegative(1);
    isNegative(-1);
    hello("Андрей");
    isLeapYear(400);
    isLeapYear(2003);
    isLeapYear(500);
    isLeapYear(2008);
  }

  private static float count(float a, float b, float c, float d) {
    float result = a * (b + (c / d));
    System.out.println(result);
    return result;
  }

  private static boolean checkValue(int a) {
    if (10 > a) {
      System.out.println("false");
      return false;
    }
    if (20 < a) {
      System.out.println("false");
      return false;
    }
    System.out.println("true");
    return true;
  }

  private static void printSign(int a) {
    if (a >= 0) {
      System.out.printf("Число %d положительное%n", a);
    } else {
      System.out.printf("Число %d отрицательное%n", a);
    }
  }

  private static boolean isNegative(int a) {
    if (a < 0) {
      System.out.println("true");
      return true;
    } else {
      System.out.println("false");
      return false;
    }
  }

  private static void hello(String name) {
    System.out.printf("Привет %s!%n", name);
  }

  private static void isLeapYear(int year) {
    if (year % 400 == 0) {
      System.out.printf("Год %d является високосным.%n", year);
    } else if (year % 100 == 0) {
      System.out.printf("год %d не является високосным.%n", year);
    } else if (year % 4 == 0) {
      System.out.printf("Год %d является високосным.%n", year);
    } else {
      System.out.printf("год %d не является високосным.%n", year);
    }
  }
}
