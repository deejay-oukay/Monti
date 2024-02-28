package org.example;

import java.util.Random;

public class GameHost {
    private final int winDoor, doorsCount;
    private final Random random = new Random();

    public GameHost(int winDoor, int doorsCount) {
        this.winDoor = winDoor;
        this.doorsCount = doorsCount;
    }

    public int defDoor(int firstDoor) {
        int defDoor;
        do {
            defDoor = random.nextInt(doorsCount);
        } while (defDoor == firstDoor || defDoor == winDoor);
        return defDoor;
    }
}