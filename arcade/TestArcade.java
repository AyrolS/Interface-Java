package com.arcade;

public class TestArcade {
    public static void main(String[] args) {
        ArcadeMachine arcadeMachine = new ArcadeMachine();
        Person person = new Person(10);

        //you can play the game as long as you have coins left like a real arcade machine

        while (person.coins != 0) {
            person.insertCoins(arcadeMachine);
        }
        if (person.coins == 0){
            System.out.println("NO COINS LEFT");
            System.exit(0);
        }
    }
}
