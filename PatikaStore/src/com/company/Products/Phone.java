package com.company.Products;

public class Phone extends Product{

    private static int count = 0;
    int batteryPower;
    Color color;
    int camera;

    public Phone(int price, float discount, int stockAmount, String name, String brand, int memoryCapacity, float screenSize, int ram,int batteryPower,Color color, int camera) {
        super(price, discount, stockAmount, name, brand, memoryCapacity, screenSize, ram);
        id = setId();
        this.batteryPower = batteryPower;
        this.color = color;
        this.camera = camera;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    private int setId(){
        return ++count;
    }
}
