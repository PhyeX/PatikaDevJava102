package com.company.Stores;


import com.company.Products.Color;
import com.company.Products.Laptop;
import com.company.Products.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Loader {

    static int storeId = 0;


   // Markalar statik olarak kod blokları içerisinden aşağıdaki sıra ile eklenmelidir
    //Markalar : Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster
    public static TreeSet<Store> loadStores(){

        String [] stores = new String []{"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        TreeSet<Store> set = new TreeSet<Store>();

        for( String storeName : stores){
            Store store = new Store( storeName );

            Laptop laptop = new Laptop(1200,2.1f,2,"Tulphar","Monster",512,16.1f,8);
            Phone phone = new Phone(1200,2.1f,2,"Tulphar","Monster",512,16.1f,8,1200, Color.Mavi,8);
            store.getLaptopList().add(laptop);
            store.getPhoneList().add(phone);
            set.add( store );

        }

        return set;
    }

}
