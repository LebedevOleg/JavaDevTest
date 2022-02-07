import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа выводит сумму цифр в строке, если цифр нет, то выводится 0");
        System.out.println("Введите строку: ");
        String input = in.nextLine();
        System.out.println("Результат сложения: " + summ(input));
    }

    static int summ(String line) {
        if (line.isEmpty()) {
            return 0;
        }
        int res = 0;
        char[] lineArray = line.toCharArray();
        for (int i = 0; i < lineArray.length; i++) {
            if (Character.isDigit(lineArray[i])) {
                res += Character.getNumericValue(lineArray[i]);
            }
        }
        return res;
    }
}