package by.tms.task2practice;

import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.Scanner;

@NoArgsConstructor

public class Computer {

    private String processor;
    private String ram;
    private String hardDrive;
    private int resource;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private boolean burned;

    public Computer(String processor, String ram, String hardDrive, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resource = resource;
    }

    public Computer(int resource) {
        this.resource = resource;
    }

    public void on() {
        if (!burned) {
            int count = random.nextInt(2);
            if (resource != 0 && enterNumber() == count) {
                System.out.println("The computer turned on");
            } else {
                burned = true;
            }
        }
    }

    private void burned() {
        System.out.println("The computer burned down!");
        burned = true;
    }

    public void off() {
        if (!burned && resource != 0) {
            System.out.println("Turning off the computer");
            resource--;
        } else {
            burned();
        }
    }

    private int enterNumber() {
        System.out.println("Enter 0 or 1");
        int number = 0;
        do {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Mistake!");
                scanner.next();
            }
        } while (number < 0 || number > 1);
        return number;
    }

    public boolean isBurned() {
        return burned;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", resource=" + resource +
                '}';
    }
}
