package com.company.Armors;

public abstract class Armor {
    int id;
    int block;
    int cost;

    public Armor(int id, int block, int cost) {
        this.id = id;
        this.block = block;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
