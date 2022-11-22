package by.tms.model;

import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.Scanner;

@NoArgsConstructor

public class Computer {

    private String processor;
    private String ram;
    private String hardDrive;
    public int resource;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
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
            int enteredNumber = enterNumber();
            int count = 0;//random.nextInt(2);
            if (enteredNumber == count) {
                off();
            } else {
                System.out.println("The computer burned down!");
                burned = true;
            }
        } else {
            System.out.println("The computer burned down!");
        }
    }

    private void off() {
        System.out.println("Turning off the computer");
        this.resource--;
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
