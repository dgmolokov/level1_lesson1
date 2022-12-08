package ru.geekbrains.lesson1;

public class Main {
    //  1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
//      2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte a = 10;
        short b = 10000;
        int c = 1000000000;
        long d = 10000000000000000L;
        float e = 0.75f;
        double f = 70000000.5443;
        char j = 'b';
        boolean h = true;
        System.out.println(count(2f, 3f, 4f, 5f));
        System.out.println(checkValue(20));
        System.out.println(checkValue(50));
        printSign(1);
        printSign(-1);
        System.out.println(isNegative(1));
        System.out.println(isNegative(-1));
        hello("Андрей");
        isLeapYear(400);
        isLeapYear(2003);
        isLeapYear(500);
        isLeapYear(2008);
    }

    //  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //  где a, b, c, d – входные параметры этого метода;
    private static float count(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //  4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false;
    private static boolean checkValue(int a) {
        if (10 > a) {
            return false;
        }
        if (20 < a) {
            return false;
        }
        return true;
    }

    //  5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    //  положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    private static void printSign(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число" + a + " отрицательное");
        }
    }

    //  6. Написать метод, которому в качестве параметра передается целое число,
    //  метод должен вернуть true, если число отрицательное;
    private static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //  7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //  метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    private static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //  8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    //  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void isLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " не является високосным.");
        }
    }
}
