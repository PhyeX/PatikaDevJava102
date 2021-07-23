package com.company.Places.DangerousPlaces;

import com.company.Monsters.Obstacle;
import com.company.Places.BattleLoc;

public class Mine  extends BattleLoc {
    public Mine(Obstacle obstacle) {
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
