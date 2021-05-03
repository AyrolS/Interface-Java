package com.arcade;

public class Person {

    public int coins;

    public Person(int coins){
        this.coins = coins;
    }

    public void insertCoins(Coins coinable){

        System.out.println("Coin inserted");
        coins--;
        System.out.println("Your coins left are: "+ coins);
    }
}
