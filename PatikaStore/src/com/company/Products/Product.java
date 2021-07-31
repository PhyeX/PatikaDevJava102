package com.company.Products;

public class Product {

    int id;
    int price;
    float discount;
    int stockAmount;
    String name;
    String brand;
    int memoryCapacity;
    float screenSize;
    int ram;

    public Product(int price, float discount, int stockAmount, String name, String brand, int memoryCapacity, float screenSize, int ram) {
        this.price = price;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
        this.memoryCapacity = memoryCapacity;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
