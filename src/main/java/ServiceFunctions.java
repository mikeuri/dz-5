import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceFunctions {
    public static int getConsoleValue (String valName) {
        Scanner scanner = new Scanner(System.in);
        boolean inCatch = true;
        int val = 0;

        do {
            try {
                inCatch = false;
                System.out.printf("Enter %s: ", valName);
                val = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                inCatch = true;
                System.out.println("The value should be integer");
            }
        } while (inCatch == true);

        return val;

    }


}
