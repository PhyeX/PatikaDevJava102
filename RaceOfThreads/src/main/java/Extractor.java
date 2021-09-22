import java.util.List;

public class Extractor implements Runnable{

    List<Integer> list;
    List<Integer> odd;
    List<Integer> even;

    public Extractor(List<Integer> list, List<Integer> odd, List<Integer> even) {
        this.list = list;
        this.odd = odd;
        this.even = even;
    }

    @Override
    public void run() {
        for( int i = 0 ; i < list.size() ; i++ ){
            if( list.get(i) % 2 == 0 )
               addToEven(i);
            else
                addToOdd(i);
        }
    }

     private synchronized void addToEven(int i){
        even.add( list.get(i) );
    }
    private synchronized void addToOdd(int i){
        odd.add( list.get(i) );
    }

}
