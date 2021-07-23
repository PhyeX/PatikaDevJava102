package com.company.Monsters;

public class Obstacle {
    Monster monster;
    short number;

    public Obstacle(Monster  monster, short number) {
        this.monster = monster;
        this.number = number;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonsters(Monster monster) {
        this.monster  = monster;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }
}
