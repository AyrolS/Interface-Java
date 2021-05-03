package com.ayrol;

public class TestMachine {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        Person person = new Person(10);

        person.insertCoins(gumballMachine);
    }
}
