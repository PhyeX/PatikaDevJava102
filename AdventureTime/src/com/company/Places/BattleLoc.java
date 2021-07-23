package com.company.Places;

import com.company.Monsters.Monster;

import com.company.Monsters.Obstacle;
import com.company.Player;

public abstract class BattleLoc extends Location{

    Obstacle obstacle;

    public BattleLoc(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {

        return true;
    }

    public abstract boolean BattleLoc();
    public abstract void combat();
}
