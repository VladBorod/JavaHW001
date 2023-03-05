//Реализовать простой калькулятор.
//Импорт функций.
import java.util.Scanner;
//Создание класса.
public class Ex3SimpleCalculator {
//    Создание main.
    public static void main(String[] args) {
//        Ввод данных.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float numOne = in.nextFloat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter second number: ");
        float numTwo = sc.nextFloat();
        Scanner go = new Scanner(System.in);
        System.out.println("Enter arithmetic operation, \n" +
                "1 - addition, 2 - substruction, \n" +
                "3 - multiplication, 4 - division, 5 - remainder of the division, \n" +
                "6 - exponentiation, 7 - squre root, 8 - cube root, \n" +
                "be careful with exponantiation of floating point numbers and too big numbers, \n" +
                "in case of roots insert in second number any number: ");
        int operation = go.nextInt();
        in.close();
        sc.close();
        go.close();
//        Оператор переключения через числа.
        switch (operation){
            case 1:
                System.out.printf("addition: = %f!", addition(numOne, numTwo));
                break;
            case 2:
                System.out.printf("substruction: = %f", substruction(numOne, numTwo));
                break;
            case 3:
                System.out.printf("multiplication: = %f", multiplication(numOne, numTwo));
                break;
            case 4:
                System.out.printf("division: = %f", division(numOne, numTwo));
                break;
            case 5:
                System.out.printf("remainder of the division: = %f", remainderOftheDivision(numOne, numTwo));
                break;
            case 6:
                System.out.printf("exponentiation: = %f", exponentiation(numOne, numTwo));
                break;
            case 7:
                System.out.printf("squre root: = %f", squreRoot(numOne, numTwo));
                break;
            case 8:
                System.out.printf("qube root: = %f", qubeRoot(numOne, numTwo));
                break;
            default:
                System.out.println("There is no such operation, we are working on it!");
                break;
        }
    }
//    Функция сложения.
    public static float addition(float x, float y) {
        return x + y;
    }
//    Функция вычитания.
    public static float substruction(float x, float y) {
        return x - y;
    }
//    Функция умножения.
    public static float multiplication(float x, float y) {
        return x * y;
    }
//    Функция деления.
    public static float division(float x, float y) {
        return x / y;
    }
//    Вычисление остатка от деления.
    public static float remainderOftheDivision(float x, float y) {
        return x % y;
    }
//    Возведение в степень.
    public static float exponentiation(float x, float y) {
        return (float) Math.pow(x, y);
    }
//    Вычисление квадратного корня.
    public static float squreRoot(float x, float y) {
        return (float) Math.sqrt(x);
    }
//    Вычисление кубического корня.
    public static float qubeRoot(float x, float y) {
        return (float) Math.cbrt(x);
    }
}
