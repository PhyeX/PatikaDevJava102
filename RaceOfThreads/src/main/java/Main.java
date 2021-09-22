import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10000);

        for( int i = 0 ; i <= 10000 ; i++ ){
            list.add(i);
        }

        List<Integer> odds = new ArrayList<>(5000);
        List<Integer> evens = new ArrayList<>(5000);

        List<Integer> subList1 = list.subList(0,2500);
        List<Integer> subList2 = list.subList(2500,5000);
        List<Integer> subList3 = list.subList(5000,7500);
        List<Integer> subList4 = list.subList(7500,10000);

        Extractor extractor1 = new Extractor(subList1,odds,evens);
        Extractor extractor2 = new Extractor(subList2,odds,evens);
        Extractor extractor3 = new Extractor(subList3,odds,evens);
        Extractor extractor4 = new Extractor(subList4,odds,evens);

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(extractor1);
        executor.execute(extractor2);
        executor.execute(extractor3);
        executor.execute(extractor4);

        evens.forEach(System.out::println);





    }
}
