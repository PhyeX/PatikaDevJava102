package com.company.Monsters;

import java.util.Random;

public class Snake extends Monster{
    public Snake () {
        super(4, new Random().nextInt(3) + 3 , 12, 0);
    }
}
