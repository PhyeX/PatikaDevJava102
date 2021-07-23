package com.company.Places;

import com.company.Player;

public abstract class NormalLoc extends Location{


    public NormalLoc(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
