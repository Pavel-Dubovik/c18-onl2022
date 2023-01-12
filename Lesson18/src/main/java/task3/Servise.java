package task3;

import java.util.Scanner;

public class Servise {
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Object getValue() {
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Введите строку:");
                IValue<String> result = this::reverse;
                return result.getValue(scanner.next());
            }
            case 2 -> {
                System.out.println("Введите число:");
                IValue<Integer> result = this::getFactorial;
                return result.getValue(scanner.nextInt());
            }
            default -> throw new IllegalArgumentException("Вы ввели неправильную цифру");
        }
    }

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
