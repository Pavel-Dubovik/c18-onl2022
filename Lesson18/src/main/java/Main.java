import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
        /**
         * 1. Написать программу для вывода на консоль названия дня недели по
         * введенной дате.
         */

        {
            System.out.println("\n\t---Task 1---\n");

            String date = "2023-01-02";
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
            System.out.println(localDate.format(dateTimeFormatter));
        }

        /**
         * 2. Написать программу для вывода на экран дату следующего вторника.
         */

        {
            System.out.println("\n\t---Task 2---\n");

            LocalDate localDate = LocalDate.of(2023, 1, 7);
            TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
            System.out.println(localDate.with(nextTue));
        }
    }
}
