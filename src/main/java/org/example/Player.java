package org.example;

import lombok.Getter;
import java.util.Random;

public class Player {
    @Getter
    private int firstDoor, secondDoor;
    private final int doorsCount;
    private final Random random = new Random();

    public Player(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void firstChoice() {
        firstDoor = random.nextInt(doorsCount);
    }

    public void secondChoice(int defDoor) {
        do {
            secondDoor = random.nextInt(doorsCount);
        } while (secondDoor == defDoor || secondDoor == firstDoor);
    }
}