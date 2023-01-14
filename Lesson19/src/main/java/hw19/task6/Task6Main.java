package hw19.task6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6Main {
    /**
     * 6) Пишем библиотеку.
     * Для каждой книги библиотечного фонда известны автор, название и год издания.
     * Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
     * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
     * Рассылки организуют сотрудники библиотеки: напоминают о сроке возврата книг, сообщают новости.
     * Создаем классы:
     * - Book с полями Автор, Название, Год издания
     * - Reader(читатель) с полями ФИО, электронный адрес, флаг согласия на рассылку, список взятых книг
     * - EmailAddress  с полями электронный адрес, дополнительная информация
     * - Library содержит список книг и список читателей.
     * <p>
     * Задачи:
     * <p>
     *
     *
     *
     *
     *
     *
     * <p>
     * Задачи со ЗВЕЗДОЧКОЙ:
     */
    public static void main(String[] args) {

        Book book1 = new Book("Джоан Роулинг", "Гарри Поттер и Тайная комната", 2021);
        Book book2 = new Book("Фредрик Бакман", "Вторая жизнь Уве", 2016);
        Book book3 = new Book("Дмитрий Глуховский", "Метро 2033", 2021);
        Book book4 = new Book("Уолтер Тевис", "Ход королевы", 2020);

        Library library = new Library();
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Reader reader1 = new Reader("Бояренко Г.А.", "boyarenko@furman.by", true);
        Reader reader2 = new Reader("Крень Р.О.", "kren@furman.by", true);
        Reader reader3 = new Reader("Секретарева Е.М.", "sekretareva@furman.by", true);
        Reader reader4 = new Reader("Мартынов П.Ю.", "martynov@furman.by", true);

        reader1.setBooks(Arrays.asList(book1, book2, book4));
        reader2.setBooks(Arrays.asList(book2, book3));
        reader3.setBooks(Arrays.asList(book3, book4, book1, book2));
        reader4.setBooks(Arrays.asList(book1, book4));

        library.getReaders().add(reader1);
        library.getReaders().add(reader2);
        library.getReaders().add(reader3);
        library.getReaders().add(reader4);

        /**
         * a) Получить список всех книг библиотеки, отсортированных по году издания.
         */

        {
            System.out.println("\n\t--- a) ---");
            List<Book> booksSortedByIssueYear = library.getBooks().stream()
                    .sorted(Comparator.comparing(Book::getIssueYear))
                    .toList();
            booksSortedByIssueYear.forEach(System.out::println);
        }

        /**
         * b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
         * При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
         */

        {
            System.out.println("\n\t--- b) ---");
            List<EmailAddress> emailAddresses = library.getReaders().stream()
                    .map(Reader::getEmail)
                    .map(EmailAddress::new)
                    .toList();
            emailAddresses.forEach(System.out::println);
        }

        /**
         * c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
         * Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
         */

        {
            System.out.println("\n\t--- c) ---");
            List<EmailAddress> emailAddresses = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .filter(reader -> reader.getBooks().size() > 1)
                    .map(Reader::getEmail)
                    .map(EmailAddress::new)
                    .toList();
            emailAddresses.forEach(System.out::println);
        }

        /**
         * d) Получить список всех книг, взятых читателями.
         * Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
         */

        {
            System.out.println("\n\t--- d) ---");
            List<Book> bookList = library.getReaders().stream()
                    .flatMap(reader -> reader.getBooks().stream())
                    .distinct()
                    .toList();
            bookList.forEach(System.out::println);
        }

        /**
         * e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
         */

        {
            System.out.println("\n\t--- e) ---");
            boolean isTaken = library.getReaders().stream()
                    .flatMap(reader -> reader.getBooks().stream())
                    .anyMatch(book -> "Уолтер Тевис".equals(book.getAuthor()));
            System.out.println(isTaken);
        }

        /**
         * а*) Узнать наибольшее число книг, которое сейчас на руках у читателя.
         */

        {
            System.out.println("\n\t--- a*) ---");
            Integer result = library.getReaders().stream()
                    .map(reader -> reader.getBooks().size())
                    .reduce(0, (max, size) -> size > max ? size : max);
            System.out.println(result);
        }

        /**
         * b) Необходимо рассылать разные тексты двум группам:
         * * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
         * * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
         * * То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
         * * или TOO_MUCH — если их две и больше. Порядок групп не важен.
         */

        {
            System.out.println("\n\t--- b*) ---");
            Map<String, List<EmailAddress>> groupingMap = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(Collectors.groupingBy(reader -> reader.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                            Collectors.mapping(r -> new EmailAddress(r.getEmail()), Collectors.toList())));

            for (Map.Entry<String, List<EmailAddress>> stringListEntry : groupingMap.entrySet()) {
                String emails = stringListEntry.getValue().stream()
                        .map(EmailAddress::getEmail)
                        .collect(Collectors.joining(", "));
                System.out.println(stringListEntry.getKey() + " - " + emails);
            }
        }

        /**
         * с) Для каждой группы (OK, TOO_MUCH) получить списки читателей в каждой группе.
         */

        {
            System.out.println("\n\t--- c*) ---");
            Map<String, List<Reader>> readersMap = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(Collectors.groupingBy(reader -> reader.getBooks().size() > 2 ? "TOO_MUCH" : "OK"));

            for (Map.Entry<String, List<Reader>> stringListEntry : readersMap.entrySet()) {
                System.out.println(stringListEntry.getKey() + " - " + stringListEntry.getValue());
            }
        }

        /**
         * d) Для каждой группы (OK, TOO_MUCH) получить ФИО читателей в каждой группе, перечисленные через запятую.
         * И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
         * Пример: TOO_MUCH {Иванов Иван Иванович, Васильев Василий Васильевич}
         * OK {Семёнов Семён Семёнович}
         */

        {
            System.out.println("\n\t--- d*) ---");
            Map<String, String> readersFIOMap = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(Collectors.groupingBy(reader -> reader.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                            Collectors.mapping(Reader::getFio, Collectors.joining(", ", "{", "}"))));

            for (Map.Entry<String, String> stringStringEntry : readersFIOMap.entrySet()) {
                System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
            }
        }
    }


}
