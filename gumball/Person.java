package com.ayrol;

public class Person {
    private int coins;

    public Person(int coins){
        this.coins = coins;
    }

    public void insertCoins(Coinable coinable){
        System.out.println("Coin inserted");
        coins = coins - 3;
        if(!coinable.insertCoin()){
            coins++;
            System.out.println("Coin refunded");
        }
        System.out.println("Coin count: "+ coins);
    }
}