package com.company;

import java.util.Arrays;

public class MyList<T> {

    T [] list;
    int capacity = 10;
    int index = 0;
    MyList() {
        list = (T[]) new Object[capacity];
    }

    MyList(int capacity){
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public int size(){

       return index;
    }

    public int getCapacity(){
        return capacity;
    }

    public void add( T data){
        if ( index+1 == capacity ){
            capacity *= 2;
            list =  Arrays.copyOf(list,capacity );
        }
        list[index++] = data;
    }

    public T get( int index ){

        try {
            return list[index];
        }catch ( Exception e ){
            return null;
        }
    }

    public T remove ( int index ){

        T removed = get(index);

        if(  removed == null )
            return null;

        for(int i = index ; i < this.index ; i++ ){
            list[index] = list[index+1];
        }
        this.index -= 1;

        return removed;
    }

    public boolean isEmpty() {

      return list[0] == null;
    }
    public T set(int index, T data){
     T previousData = get(index);
     if( get(index) == null ) return null;
     list[index] = data;

     return previousData;
    }

    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for( int i = 0 ; i < size() ; i++ ){
            if( list[i+1] == null){
                buffer.append(list[i]);
                break;
            }else{
                buffer.append(list[i]).append(",");
            }
        }
        buffer.append("]");

        return buffer.toString();
    }

    public int indexOf(T data){

        for( int i = 0 ; i < size() ; i++ ){
            if( data ==  list[i] )
                return i;
        }

        return -1;
    }

    public int lastIndexOf(T data){

        for( int i = size()-1 ; i >= 0 ; i-- ){
            if( data ==  list[i] )
                return i;
        }

        return -1;
    }

    public T[] toArray(){

        return Arrays.copyOf(list,size());
    }

    public void clear(){
        capacity = 10;
        index = 0;
        list = (T[]) new Object[capacity];
    }

    public MyList<T> subList(int start,int finish){
        if( get(start) == null || get(finish) == null)
            return null;
        MyList<T> sub = new MyList<T>(finish-start);

        for( int i = start ; i <= finish ; i++ ){
            sub.add(list[i]);
        }

        return sub;
    }

    boolean contains(T data){

        for( int i = 0 ; i < size() ; i++ ){
            if( data == list[i])
                return true;
        }

        return false;
    }

}
/*
S??n??f ??zellikleri :

S??n??f i??erisindeki dizinin varsay??lan boyutu 10 ve dizinin eleman say??s?? ihtiya?? duyduk??a 2 kat?? ??eklinde artmal??.
S??n??fa ait iki t??r constructor metot bulunmal??
MyList() : Bo?? contructor kullan??l??rsa dizinin ba??lang???? boyutu 10 olmal??d??r. ++
MyList(int capacity) : Dizinin ba??lang???? de??eri capacity parametresinden al??nmal??d??r. ++
size() : dizideki eleman say??s??n?? verir.
getCapacity() : dizinin kapasite de??erini verir.
add(T data) : s??n??fa ait diziye eleman eklemek i??in kullan??lmal??d??r. E??er dizide yeteri kadar yer yok ise, dizi boyutu 2 kat??na ????kart??lmal??d??r.
get(int index): verilen indisteki de??eri d??nd??r??r. Ge??ersiz indis girilerse null d??nd??r??r.
remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonras??nda ki verileri sol do??ru kayd??rmal??. Ge??ersiz indis girilerse null d??nd??r??r.
set(int index, T data) : verilen indisteki veriyi yenisi ile de??i??tirme i??lemini yapmal??d??r. Ge??ersiz indis girilerse null d??nd??r??r.
String toString() : S??n??fa ait dizideki elemanlar?? listeleyen bir metot.

int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 de??erini verir.
int lastIndexOf(T data) : Belirtilen ????enin listedeki son indeksini s??yler. Nesne listede yoksa -1 de??erini verir.
boolean isEmpty() : Listenin bo?? olup olmad??????n?? s??yler.
T[] toArray() : Listedeki ????eleri, ayn?? s??rayla bir array haline getirir.
clear() : Listedeki b??t??n ????eleri siler, bo?? liste haline getirir.

MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aral??????na ait bir liste d??ner.
boolean contains(T data) : Parametrede verilen de??erin dizide olup olmad??????n?? s??yler.
 */