package org.abdestech.learning.rfb18;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class Library {

    List <Book> storage = new ArrayList<>();

    public void addBook(Book book) {
        storage.add(book);
    }

    public Book getRequiredBook (String title) throws BookIsReservedException{
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getTitle().equalsIgnoreCase(title) && !storage.get(i).getReserved()) {
                storage.get(i).setReserved(true);
                return storage.get(i);
            }
            else {throw new BookIsReservedException("книга зарезервирована или не найдена");}
        }
        return null;
    }

    public List<Book> getStorage() {
        return storage;
    }
}

