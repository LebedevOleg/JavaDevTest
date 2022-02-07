import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        String[] one_arr = { "  *  ", " **  ", "* *  ", "  *  ", "  *  ", "  *  ", "*****" };
        String[] two_arr = { " *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****" };
        String[] three_arr = { " *** ", "*   *", "    *", "  ** ", "    *", "*   *", " *** " };
        String[] four_arr = { "   * ", "  ** ", " * * ", "*  * ", "*****", "   * ", "   * " };
        String[] five_arr = { "*****", "*    ", "*    ", " *** ", "   **", "    *", "**** " };
        String[] six_arr = { "  ****", " **   ", "**    ", "***** ", "*    *", "*    *", "***** " };
        String[] seven_arr = { "*****", "    *", "   * ", "   * ", "  *  ", "  *  ", "  *  " };
        String[] eight_arr = { " *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** " };
        String[] nine_arr = { " *** ", "*   *", "*   *", " ****", "    *", "    *", "**** " };
        String[] zero_arr = { " *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** " };
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
        char[] num_arr = line.toCharArray();
        String res = "";
        for (int i = 0; i < 7; i++) {
            for (int y = 0; y < num_arr.length; y++)
                switch (num_arr[y]) {
                    case '1':
                        res += one_arr[i] + "  ";
                        break;
                    case '2':
                        res += two_arr[i] + "  ";
                        break;
                    case '3':
                        res += three_arr[i] + "  ";
                        break;
                    case '4':
                        res += four_arr[i] + "  ";
                        break;
                    case '5':
                        res += five_arr[i] + "  ";
                        break;
                    case '6':
                        res += six_arr[i] + "  ";
                        break;
                    case '7':
                        res += seven_arr[i] + "  ";
                        break;
                    case '8':
                        res += eight_arr[i] + "  ";
                        break;
                    case '9':
                        res += nine_arr[i] + "  ";
                        break;
                    case '0':
                        res += zero_arr[i] + "  ";
                        break;
                }
            res += "\n";
        }
        System.out.println(res);
    }
}
