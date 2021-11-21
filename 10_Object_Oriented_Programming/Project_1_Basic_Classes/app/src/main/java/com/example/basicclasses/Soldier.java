package com.example.basicclasses;

import android.util.Log;

public class Soldier {
    int health;
    String soldierType;

    void shootEnemy() {
        //let's print which type of soldier is shooting
        Log.i(soldierType, " is shooting");
    }

    //public void healSoldier(Soldier soldierToBeHealed)
    Soldier healSoldier(Soldier soldierToBeHealed) {
        soldierToBeHealed.health++;

        return soldierToBeHealed;
    }
}
