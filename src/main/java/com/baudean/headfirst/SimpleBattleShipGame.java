package com.baudean.headfirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jd on 11/3/14.
 */
public class SimpleBattleShipGame {

    //List<Ship> shipList = new ArrayList<Ship>();
    List<Ship> shipList;

    public SimpleBattleShipGame(){
        this.setShipList(3);
    }

    /**
    *
    */
    public void setShipList(int numberOfShips) {
        List<Ship> shipList = new ArrayList<Ship>();
        Random randomGenerator = new Random();
        for (int i = 0; i < numberOfShips; i++) {
            List<Integer> locations = new ArrayList<Integer>();
            locations.add(randomGenerator.nextInt(7) + 1);
            locations.add(randomGenerator.nextInt(7) + 1);
            locations.add(randomGenerator.nextInt(7) + 1);

            shipList.add(new Ship(locations));
        }
        this.shipList = shipList;
    }
    public static void main(String[] args) {
        SimpleBattleShipGame game = new SimpleBattleShipGame();
        //String check = game.checkHit(2);
        //System.out.println(check);
        //System.out.println(String.format("You guessed %s times\n", game.getGuesses()));
    }
}
