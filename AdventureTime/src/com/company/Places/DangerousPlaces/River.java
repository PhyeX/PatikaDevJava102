package com.company.Places.DangerousPlaces;

import com.company.Monsters.Obstacle;
import com.company.Places.BattleLoc;

public class River extends BattleLoc {
    public River(Obstacle obstacle) {
        super(obstacle);
    }

    @Override
    public boolean BattleLoc() {
        return false;
    }

    @Override
    public void combat() {

    }
}
