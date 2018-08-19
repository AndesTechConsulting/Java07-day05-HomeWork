package org.abdestech.learning.rfb18;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> libraryList;

    public Library(){
        libraryList = new ArrayList<String>();
    }

    public void addLibraryList(Book book){
        libraryList.add(book.getAuthor().toString() + "\t|\t" + book.getTitle().toString() + "\t|\t" + book.getYear() + "\t|\t" + book.getISBN().toString());
    }

    public void viewLibrary(){
        System.out.println("Library\nAutor\t|\ttitle\t|\tyear\t|\tISBN");
        for(Object o:libraryList){
            System.out.println(o);
        }
    }

//    public void getBookInLibrary(int index){
//        System.out.println(libraryList.get(index));
//    }


    public ArrayList<String> getLibraryList() {
        return libraryList;
    }
}
