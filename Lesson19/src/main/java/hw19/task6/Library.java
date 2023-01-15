package hw19.task6;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (readers == null) {
            readers = new ArrayList<>();
        }
        return readers;
    }
}
