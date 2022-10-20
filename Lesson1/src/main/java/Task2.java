import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество значений:");
        int n = console.nextInt();
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + "-е число:");
            array[i] = scanner.nextLine();
            int val = Integer.parseInt(array[i]);
            if (val > 0) {
                count = count + 1;
            }
        }
        System.out.println("Количесттво положительных чисел = " + count);
    }
}
