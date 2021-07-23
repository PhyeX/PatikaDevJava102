package com.company.Places.SafePlaces;

import com.company.Armors.Armor;
import com.company.Armors.HeavyArmor;
import com.company.Armors.LightArmor;
import com.company.Armors.MediumArmor;
import com.company.Places.NormalLoc;
import com.company.Player;

import java.util.Scanner;

public class SafeHouse extends NormalLoc {


    public SafeHouse(Player player,int maxHealth) {
        super(player);
        player.getMainCharacter().setHealth(maxHealth);
    }

    @Override
    public boolean onLocation() {

        System.out.println("You have fulled your health!");
        return false;
    }

}
