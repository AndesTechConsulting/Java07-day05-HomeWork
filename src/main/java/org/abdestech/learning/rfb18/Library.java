package org.abdestech.learning.rfb18;

import java.util.ArrayList;

public class Library  {

    private String LName, LAddress;
    private int volume;
    private static int BkIndex = 0;
    private String[] booksStatus = {"In Storage", "Spoiled", "Issued"};
    ArrayList<Book> books;

//---------------------------------------------------------
    Library(String LName, String LAddress, int volume) {

        this.LName = LName;
        this.LAddress = LAddress;
        this.volume = volume;
        books = new ArrayList<>(this.volume);
    }

    Library(String LName, String LAddress) {

        this.LName = LName;
        this.LAddress = LAddress;
        volume = 100;
        books = new ArrayList<>(volume);
    }

    Library() {

        this.LName = "Ddemin's Library";
        this.LAddress = "Omsk city, Aviagorodok str, 9";
        volume = 10;
        books = new ArrayList<>(volume);
    }
//---------------------------------------------------------
    public String getLName() {

        return LName;
    }

    void setLName(String LName) {

        this.LName = LName;
    }

    public String getLAddress() {

        return LAddress;
    }

    void setLAddress(String LAddress) {

        this.LAddress = LAddress;
    }
//---------------------------------------------------------

    void addBook(String BTitle, String BAuthor, int BYear)
                           throws OutFromFutureException {

        books.add(BkIndex, new Book(BTitle, BAuthor, BYear, booksStatus[0]));
        BkIndex++;
    }

    public Book getBook(String BkTitle, String BkAuthor, int BkY)
            throws OutOfLibException, SpoiledBookException {
            short BkYear = (short) BkY;
        for(int i = 0; i < BkIndex; i++) {
            Book bk = books.get(i);

            if( BkTitle.equals(bk.getTitle()) && (BkAuthor.equals(bk.getAuthor())) && (BkYear == bk.getYear())) {
                if (bk.getBookStatus() == booksStatus[2]) {
                    throw new OutOfLibException();
                }
                if (bk.getBookStatus() == booksStatus[1]) {
                    throw new SpoiledBookException();
                }
                System.out.println("Книга найдена");
                bk.setBookStatus(booksStatus[2]);
                System.out.println("Статус книги изменен на " + bk.getBookStatus());
                return bk;
            } else {
                continue;
            }
        }
        System.out.println("Книга не найдена");
        return null;
    }

    public boolean getBookInfo (String BTitle) {

        Book bk;
        Book[] foundBks = new Book [volume>>1];
        int j = 0;

        for(int i = 1; i < BkIndex; i++) {
            bk = books.get(i);
            if( BTitle == bk.getTitle()) {
                foundBks[j] = bk;
                j++;
            } else {
                continue;
            }
        }
        if (foundBks.length != 0) {
            System.out.println("Книга найдена:");
            for(int i = 0; i <= j; i++){
                bk = foundBks[i];
                System.out.println(bk.toString());
            }
            return true;
        } else {
            System.out.println("Искомая книга не найдена.");
            return false;
        }
    }

    public boolean takeBookBack (Book returnBk) {

        Book bk;
        int index = books.indexOf(returnBk);

        if(index == -1){
            System.out.println("Книга не числится в библиотеке");
        } else {
            bk = books.get(index);
            bk.setBookStatus(booksStatus[0]);
        }
        return false;
    }
}

