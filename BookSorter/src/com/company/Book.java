package com.company;

import java.util.Date;

public class Book implements Comparable<Book> {

    String name;
    int pageCount;
    String authorName;
    Date publishDate;

    @Override
    public int compareTo(Book book ){

        if( name.compareTo(book.name) == 0 )
            return 0;
        else if( name.compareTo(book.name) > 0 )
            return 1;
        else{
            return -1;
        }

    }

    public Book(String name, int pageCount, String authorName, Date publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
