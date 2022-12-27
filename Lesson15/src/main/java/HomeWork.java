import by.tms.hw2.TextFormatter;
import by.tms.hw4.model.Car;
import by.tms.hw4.model.Engine;
import by.tms.hw4.model.GasTank;

import java.io.*;

public class HomeWork {
    public static void main(String[] args) {
        /**
         * 1) В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
         * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
         */
        {
            try (FileInputStream fis = new FileInputStream("Lesson15/src/main/java/by/tms/hw1/input.txt");
                 FileOutputStream fos = new FileOutputStream("Lesson15/src/main/java/by/tms/hw1/output.txt");
                 PrintStream printStream = new PrintStream(fos)) {
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                String inputText = new String(buffer);
                String[] array = inputText.split("\\s|\\n|\\d+");
                for (String s : array) {
                    String sLowerCase = s.trim();
                    StringBuilder stringBuilder = new StringBuilder(sLowerCase);
                    StringBuilder reverse = stringBuilder.reverse();
                    if ((reverse.toString()).equalsIgnoreCase(sLowerCase) && s.length() > 0) {
                        printStream.println(s);
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        /**
         * 2)Текстовый файл hw2/input.txt содержит текст.
         * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
         * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
         * Пишем все в ООП стиле. Создаем класс TextFormatter
         * в котором два метода:
         * 1. Метод принимает строку и возвращает кол-во слов в строке.
         * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
         * В main считываем файл.
         * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
         * Если подходит добавляем его в output.txt файл
         */
        TextFormatter formatter = new TextFormatter();
        {
            try (FileInputStream fis = new FileInputStream("Lesson15/src/main/java/by/tms/hw2/input.txt");
                 FileOutputStream fos = new FileOutputStream("Lesson15/src/main/java/by/tms/hw2/output.txt");
                 PrintStream printStream = new PrintStream(fos)) {
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                String inputText = new String(buffer).replaceAll("-\\s+", "");
                String[] sentences = inputText.split("[.!?]");

                for (String sentence : sentences) {
                    int quantity = (formatter.getNumberOfWords(sentence));
                    if (quantity >= 3 && quantity <= 5 || formatter.isPalindromeInString(sentence.split(" "))) {
                        printStream.println(sentence.trim());
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        /**
         * 3) Проверка на цензуру:
         * Создаете 2 файла.
         * 1 - й. Содержит исходный текст.
         * 2 - й. Содержит слова недопустимые в тексте (black list). Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте.
         * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что текст прошел проверку на цензуру.
         * Если нет, то выводите соответствующее сообщение, кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.
         */

        {
            System.out.println("\nTask 3\n");
            try (FileInputStream fisText = new FileInputStream("Lesson15/src/main/java/by/tms/hw3/text.txt");
                 FileInputStream fisCheck = new FileInputStream("Lesson15/src/main/java/by/tms/hw3/blackList.txt")) {
                byte[] buffer = new byte[fisText.available()];
                fisText.read(buffer);
                String text = new String(buffer).replaceAll("\\n", "");
                String[] sentences = text.split("\\.");

                byte[] bufferCheck = new byte[fisCheck.available()];
                fisCheck.read(bufferCheck);
                String blackWords = new String(bufferCheck);
                String[] words = blackWords.split(",");

                int count = 0;
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < sentences.length; j++) {
                        int index = (sentences[j].toLowerCase()).indexOf(words[i].trim().toLowerCase());
                        if (index > 0) {
                            System.out.println(sentences[j]);
                            count++;
                        }
                    }
                }
                if (count > 0) {
                    System.out.println("Количество предложений не прошедших проверку - " + count);
                } else {
                    System.out.println("Текст прошел проверку на цензуру");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        /**
         * 4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
         * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль
         */

        {
            System.out.println("\nTask 4\n");
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lesson15/src/main/java/by/tms/hw4/resources/car.dat"));
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lesson15/src/main/java/by/tms/hw4/resources/car.dat"))) {
                Car car = new Car("Mazda", new Engine("2.0 V6", 6), new GasTank(45, "petrol"), 260, 50000);
                oos.writeObject(car);

                Car mazda = (Car) ois.readObject();
                System.out.printf("Model: %s\nEngine type: %s\nGas tank:\nTotal volume: %.2f\nFuel type: %s\nMax speed: %.2f\nPrice: %.2f",
                        mazda.getModel(), mazda.getEngine().getEngineType(), mazda.getGasTank().getTotalVolume(), mazda.getGasTank().getFuelType(),
                        mazda.getMaxSpeed(), mazda.getPrice());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
