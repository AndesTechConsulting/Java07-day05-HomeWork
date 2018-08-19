package org.abdestech.learning.rfb18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Library {



    ArrayList<String> Librarylist;

    public  Library () {
        Librarylist = new ArrayList<String>();
    }

    public  void putBook(String author,String title,String year,String ISBN) {

        Librarylist.add(author+ "; " +title+"; "+year+"; "+ISBN);
    }

    public  void getlibrary () {
        for (Object o: Librarylist){
            System.out.println(o);
        }
    }



}
