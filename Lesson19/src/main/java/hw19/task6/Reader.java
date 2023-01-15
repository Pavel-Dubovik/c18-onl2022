package hw19.task6;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@ToString
public class Reader {
    private String fio;
    private String email;
    private boolean subscriber;
    private List<Book> books;

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return subscriber == reader.subscriber && Objects.equals(fio, reader.fio) && Objects.equals(email, reader.email) && Objects.equals(books, reader.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, email, subscriber, books);
    }
}
