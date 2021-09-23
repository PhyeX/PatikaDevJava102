

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Map<String,String> namesAndAuthors = new HashMap<>();

        for ( int i = 0 ; i < 10 ; i++ ){
            books.add( new Book("i"+i,i+10*10,"Yazar "+i, Date.from(Instant.now())) );
        }

        books.stream().forEach( i -> {
            namesAndAuthors.put( i.getAuthor(),i.getName() );
        });

        List<Book> booksWith100Page = books.stream().filter( i -> i.page > 100 ).collect(Collectors.toList());


    }
}
