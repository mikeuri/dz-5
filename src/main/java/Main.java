//        Створити публічний репозиторій GitHub з назвою dz–5.
//        Написати просту програму, яка:
//        1. Надає значення 4 полям типу int.
//        2. Сумує їх попарно.
//        3. Виводить результат порівняння (true якщо перша сума менша).
//        4. Збільшує першу суму на 1.
//        5. Другу суму зменшує на 2.
//        6. Виводить результат порівняння сум (true, якщо перша сума більша).
//        7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
//        Формат здачі: Прикріпити посилання на Pull request з файлами на GitHub.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Simple way to add values --------------------------
        // int val1 = ServiceFunctions.getConsoleValue("val1");
        // int val2 = ServiceFunctions.getConsoleValue("val2");
        // int val3 = ServiceFunctions.getConsoleValue("val3");
        // int val4 = ServiceFunctions.getConsoleValue("val4");
        // int sum1 = val1 + val2;
        // int sum2 = val3 + val4;
        //  --------------------------------------------------

        // More complex way to add values by using loop and arraylists
        List <Integer> valArray = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            String valueName = String.format("value %d", i);
            int val = ServiceFunctions.getConsoleValue(valueName);
            valArray.add(val);
        }

        int sum1 = valArray.get(0) + valArray.get(1);
        int sum2 = valArray.get(2) + valArray.get(3);

        System.out.println("------------------------------------------");
        System.out.println("sum1 is: " + sum1);
        System.out.println("sum2 is: " + sum2);

        // Comparing sums
        if (sum1 < sum2){
            System.out.printf("True: (%s < %s)%n", sum1, sum2);
        }
        else{
            System.out.printf("False: (%s >= %s)%n", sum1, sum2);
        }
        System.out.println("------------------------------------------");

        // Incrementing and decrementing sums
        sum1++;
        System.out.println("Incremented sum1 is: " + sum1);
        sum2-=2;
        System.out.println("Double decremented sum2 is: " + sum2);

        // Comparing sums after processing
        if (sum1 > sum2){
            System.out.printf("True: (%s > %s)%n", sum1, sum2);
        }
        else{
            System.out.printf("False: (%s <= %s)%n", sum1, sum2);
        }
        System.out.println("------------------------------------------");

        // Getting modulus values
        int modSum1 = sum1 % 2;
        int modSum2 = sum2 % 2;

        System.out.printf("modulus value for Sum1 = %d is: %d\n", sum1, modSum1);
        System.out.printf("modulus value for Sum2 = %d is: %d\n", sum2, modSum2);

        if (modSum1 == 0 || modSum2 == 0 ){
            System.out.println("True: either sum1 or sum2 is even number");
        }
        else {
            System.out.println("False: none of the values is an even number");
        }
    }
}
