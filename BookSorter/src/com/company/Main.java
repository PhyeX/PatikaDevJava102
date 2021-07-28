package com.company;

import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Book> set = new HashSet<Book>();

        Book book = new Book("Asırlık Kitap",100,"Tayyip", Date.from(Instant.now()));
        Book book1 = new Book("Romantik Kitap",100,"Revaha", Date.from(Instant.now()));
        Book book2 = new Book("Kısa Kitap",100,"Barbaros", Date.from(Instant.now()));
        Book book3 = new Book("Uzun kitap",100,"Barbar", Date.from(Instant.now()));
        Book book4 = new Book("Başarılı kitap",100,"Barbarr", Date.from(Instant.now()));
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        System.out.println(set);
        TreeSet<Book> set2 = new TreeSet<Book>();
        set2.add(book);
        set2.add(book1);
        set2.add(book2);
        set2.add(book3);
        set2.add(book4);
        System.out.println(set2);


    }
}
