package com.baudean.headfirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jd on 11/3/14.
 */
public class Ship {
    private List<Integer> shipLocation;
    private int guesses;
    private boolean hit;
    private int size;

    public Ship(List<Integer> ship) {
        this.setShipLocation(ship);
        this.setHit(false);
        this.setGuesses(0);
    }

    public boolean checkHit(int guess) {
        boolean result = false;
        if (this.getShipLocation().contains(guess)) {
            int index = this.getShipLocation().indexOf(guess);
            result = true;
            this.shipLocation.remove(index);
        }
        this.setGuesses(this.guesses + 1);
        return result;
    }

    private List<Integer> buildShip (int size) {
        if (size == 0) {
            throw new IllegalArgumentException("Ship size can't be 0");
        }
        Random randomGenerator = new Random();
        List<Integer> location = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            location.add(randomGenerator.nextInt(5) + i);
        }
        return location;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public List<Integer> getShipLocation() {
        return shipLocation;
    }

    public void setShipLocation(List<Integer> shipLocation) {
        this.shipLocation = shipLocation;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }



}
