package com.baudean.headfirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jd on 11/3/14.
 */
public class DotCom {
    private List<Integer> dotComLocation;
    private int guesses;
    private boolean hit;

    public DotCom(List<Integer> dotCom) {
        this.setDotComLocation(dotCom);
        this.setHit(false);
        this.setGuesses(0);
    }

    public String checkHit(int guess) {
        String result = "miss";
        if (this.getDotComLocation().contains(guess)) {
            int index = this.getDotComLocation().indexOf(guess);
            result = "hit";
            this.dotComLocation.remove(index);
        }
        this.setGuesses(this.getGuesses() + 1);
        return result;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public List<Integer> getDotComLocation() {
        return dotComLocation;
    }

    public void setDotComLocation(List<Integer> dotComLocation) {
        this.dotComLocation = dotComLocation;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }



}
