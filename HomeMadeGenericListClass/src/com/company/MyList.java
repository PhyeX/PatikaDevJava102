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
Sınıf özellikleri :

Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.
Sınıfa ait iki tür constructor metot bulunmalı
MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır. ++
MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır. ++
size() : dizideki eleman sayısını verir.
getCapacity() : dizinin kapasite değerini verir.
add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.

int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
boolean isEmpty() : Listenin boş olup olmadığını söyler.
T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.
clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.

MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
 */