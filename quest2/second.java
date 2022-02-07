import java.io.IOException;
import java.util.Scanner;

public class second {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String line = "";
        boolean check_line = true;
        while (check_line) {
            System.out.println("Введите целое число");
            line = in.nextLine();
            if (line.isEmpty()) {
                System.out.println("Вы ничего не ввели");
                continue;
            } else {
                try {
                    num = Integer.parseInt(line);
                    check_line = false;
                } catch (Exception ex) {
                    System.out.println("Ввод некоректен, повторите ввод");
                }
            }
        }
        double sqrt = Math.sqrt(num);
        int currentValue = num;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
            System.out.print(currentValue);
        }
    }
}
