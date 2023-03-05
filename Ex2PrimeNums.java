//Вывести все простые числа от 1 до 1000
//Решето Эратосфена.

//Импорт функций.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Создание класса.
public class Ex2PrimeNums {
//    Создание "main".
    public static void main(String[] args) {
//        Ввод данных.
        Scanner in = new Scanner(System.in);
        System.out.printf("enter end number: ");
        int endNumber = in.nextInt();
        in.close();
//        Вывод функции.
        System.out.println(primeNumbers(endNumber));
    }
//  Создание функции вычисления простых чисел через решето Эратосфена.
//  Использование массива с расширенным функционалом.
    public static List<Integer> primeNumbers(int end) {
//        Создание логического массива.
        boolean[] numPrime = new boolean[end];
//        Заполнение массива.
        Arrays.fill(numPrime, true);
//        Старт цикла с 2-ки (первое простое число).
//        Конечный шаг удаления это корень из конечного числа.
//        Итый индекс + 1.
        for (int i = 2; i * i < end; i++) {
//            Простые числа?
            if (numPrime[i]){
//                Если Итый индекс простое (к примеру перввое простое 2),
//                2 становится шагом удаления чисел из массива,
//                затем 3, 5 и так до корня из конечного числа.
//                Скорость алгоритма и заявлена как log n n log, так ли это???
                for (int j = 2 * i; j < end; j += i) {
//                    Составные числа удаляются.
                    numPrime[j] = false;
                }
            }
        }
//    Вся прелесть записывается в "специальный" массив, который мы еще не проходили,
//    Но у которого наличествуют расширенные возможности.
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < end; i++) {
            if (numPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
}
