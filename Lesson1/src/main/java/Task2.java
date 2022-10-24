import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Scanner console = new Scanner(System.in);
        System.out.println("Введите количество значений:");
        int n = console.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + "-е число:");
            String number = console.next();
            int val = Integer.parseInt(number);
            if (val > 0) {
                count = count + 1;
            }
        }
        System.out.println("Количество положительных чисел = " + count);*/

        int count = 0;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
