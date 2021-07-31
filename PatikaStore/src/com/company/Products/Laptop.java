package com.company.Products;

public class Laptop extends Product {
    private static int count = 0;

    public Laptop( int price, float discount, int stockAmount, String name, String brand, int memoryCapacity, float screenSize, int ram) {
        super( price, discount, stockAmount, name, brand, memoryCapacity, screenSize, ram);
        id = setId();
    }


    private int setId(){
        return ++count;
    }
}
