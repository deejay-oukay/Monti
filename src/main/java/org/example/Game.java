package org.example;

import java.util.Random;

public class Game {
    GameHost gameHost;
    Player player;
    private final boolean[] allDoors;
    private int winDoor;

    public Game(int doorsCount) {
        this.allDoors = new boolean[doorsCount];
        start();
        player = new Player(doorsCount);
        gameHost = new GameHost(winDoor, doorsCount);
    }

    private void start() {
        int rnd = new Random().nextInt(allDoors.length);
        allDoors[rnd] = true;
        winDoor = rnd;
    }

    public boolean result() {
        player.firstChoice();
        int defDoor = gameHost.defDoor(player.getFirstDoor());
        player.secondChoice(defDoor);
        return allDoors[player.getSecondDoor()];
    }
}