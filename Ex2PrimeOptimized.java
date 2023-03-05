//Вывести все простые числа от 1 до 1000

import java.util.Scanner;
//Создание класса.
public class Ex2PrimeOptimized {
//    Создание main.
    public static void main(String[] args) {
//        Ввод данных.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter end number: ");
        int primeOptiNum = in.nextInt();
        in.close();
//        Вывод true даннх из функции.
        for (int i = 1; i < primeOptiNum; i++) {
            if (primeOptimized(i)){
                System.out.print(i + " ");
            }

        }
    }
//    Создание функции.

    private static boolean primeOptimized(int number){
//        Простых чисел меньше 2 - нет.
        if (number < 2){
            return false;
        }
//        2 - простое число.
        if (number % 2 == 0){
            return number == 2;
        }
//        3 - простое число.
        if (number % 3 == 0){
            return number == 3;
        }
//        Исходя из закономерности в таблице простых чисел:
//        Следующее простое число 5.
//        Корень конечного числа - финал.
//        Шаг в последовательности = 6.
        for (int i = 5; i * i <= number ; i += 6) {
//           Числа в парах имеющие остаток от деления ноль - составные.
//           А потому мы их убераем.
            if (number % i == 0 || number % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
