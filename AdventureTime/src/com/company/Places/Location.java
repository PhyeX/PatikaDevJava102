package com.company.Places;

import com.company.Player;

public  abstract class Location {
    public Player player;
    public String name;

    public Location() {
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
