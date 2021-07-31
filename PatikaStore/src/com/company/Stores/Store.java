package com.company.Stores;

import com.company.Products.Laptop;
import com.company.Products.Phone;

import java.util.ArrayList;
import java.util.List;

public class Store implements Comparable<Store>{

    private static int count = 0;
    int id;
    String name;
    List<Phone> phoneList;
    List<Laptop> laptopList;

    public Store(String name) {
        this.id = getStoreId();
        this.name = name;
        phoneList = new ArrayList<>();
        laptopList = new ArrayList<>();
    }

    @Override
    public int compareTo(Store o) {

        return name.compareTo(o.name);
    };

    static int getStoreId(){

        return ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Store.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }
}
