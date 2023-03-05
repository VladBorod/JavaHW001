//Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import org.w3c.dom.ls.LSOutput;
//Импорт функций.
import java.util.Scanner;
//Создание класса.
public class Ex1TriangleNums {
//    Создание main.
    public static void main(String[] args) {
//        Введение данных.
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        input.close();
        int sum = 0;
        int mult = 1;
//        Основные действия.
        for (int i = 1; i < number; i++) {
            sum += i;
            mult *= i;
        }
//        Вывод данных.
        System.out.printf("Сумма чисел от 1 до n = %d \n", sum);
        System.out.printf("Произведение чисел от 1 до n : %d \n", mult);
    }
}
