package com.arcade;

public class ArcadeMachine implements Coins, Play {

    int games = 0;

    public ArcadeMachine() {
        this.games = 1;
    }

    @Override
    public boolean insertCoin() {
        if (this.games > 0) {
            this.play();
            return true;
        }
        return false;
    }

    @Override
    public void play() {
        System.out.println("You can now play the game");
    }
}

