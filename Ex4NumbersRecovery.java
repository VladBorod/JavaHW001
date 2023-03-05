//Импорт функций.
import java.util.Arrays;
import java.util.Scanner;
//Создание класса.
public class Ex4NumbersRecovery {
//  Создание main.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the equation: ");
        String[] inputEquation = sc.nextLine().split(" ");
        sc.close();
        System.out.println(Arrays.toString(inputEquation)); // [1?, +, 12?, =, 130]
//      Разбивка строки на элементы.
        String fNum = inputEquation[0];
        String sNum = inputEquation[2];
        String operation = inputEquation[1];
        String decision = inputEquation[4];
//      Создание временных переменных.
        String testNum;
        String fTempNum;
        String sTempNum;
//      Подбор отсутствующих знаков.
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                fTempNum = fNum.replace("?", String.valueOf(i));
                sTempNum = sNum.replace("?", String.valueOf(j));
                testNum = fTempNum + " " + operation + " " + sTempNum;
//              Условие вывода решения.
                if (Integer.parseInt(fTempNum) + Integer.parseInt(sTempNum) == Integer.parseInt(decision)) {
//                    Вывод данных при наличии решения.
                    System.out.println(testNum + " = " + decision);
                    return;
                }
            }
        }
//      Вывод данных при отсутствии решения.
        System.out.println("There is no decision!");
    }
}
