//Створити публічний репозиторій GitHub з назвою dz–5.
//
//        Написати просту програму, яка:
//        1. Надає значення 4 полям типу int.
//        2. Сумує їх попарно.
//        3. Виводить результат порівняння (true якщо перша сума менша).
//        4. Збільшує першу суму на 1.
//        5. Другу суму зменшує на 2.
//        6. Виводить результат порівняння сум (true, якщо перша сума більша).
//        7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
//        Формат здачі: Прикріпити посилання на Pull request з файлами на GitHub.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int val1 = 2;
//        int val2 = 4;
//        int val3 = 5;
//        int val4 = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first: ");
        int val1 = scanner.nextInt();

        System.out.print("Enter second: ");
        int val2 = scanner.nextInt();

        System.out.print("Enter third: ");
        int val3 = scanner.nextInt();

        System.out.print("Enter fourth: ");
        int val4 = scanner.nextInt();

        int sum1 = val1 + val2;
        int sum2 = val3 + val4;

        System.out.println("sum1 is: " + sum1);
        System.out.println("sum2 is: " + sum2);

        if (sum1 < sum2){
            //System.out.println("True (sum1 < sum2)");
            System.out.println(String.format("True: (%s < %s)", sum1, sum2));

        }
        else{
            //System.out.println("False (sum1 >= sum2)");
            System.out.println(String.format("False: (%s >= %s)", sum1, sum2));
        }
        System.out.println("------------------------------------------");

        sum1++;
        System.out.println("Incremented sum1 is: " + sum1);
        sum2-=2;
        System.out.println("Decremented sum2 is: " + sum2);

        if (sum1 > sum2){
            //System.out.println("True (sum1 > sum2)");
            System.out.println(String.format("True: (%s > %s)", sum1, sum2));
        }
        else{
            //System.out.println("False (sum1 <= sum2)");
            System.out.println(String.format("False: (%s <= %s)", sum1, sum2));
        }
        System.out.println("------------------------------------------");

        int modSum1 = sum1 % 2;
        int modSum2 = sum2 % 2;

        System.out.println("modSum1 is: " + modSum1);
        System.out.println("modSum2 is: " + modSum2);

        if (modSum1 == 0 || modSum2 ==0 ){
            System.out.println("True: either sum1 or sum2 is even number");
        }
        else {
            System.out.println("False: none of the values is an even number");

        }






    }
}
