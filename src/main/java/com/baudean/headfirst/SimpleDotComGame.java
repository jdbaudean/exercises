package com.baudean.headfirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jd on 11/3/14.
 */
public class SimpleDotComGame {

    //List<DotCom> dotComList = new ArrayList<DotCom>();
    List<DotCom> dotComList;

    public SimpleDotComGame(){
        this.dotComList = this.setDotComList(3);
    }

    public List<DotCom> setDotComList(int numberOfDotCom) {
        Random randomGenerator = new Random();
        for (int i = 0; i < numberOfDotCom; i++) {
            List<Integer> locations = new ArrayList<Integer>();
            locations.add(randomGenerator.nextInt(7) + 1);
            locations.add(randomGenerator.nextInt(7) + 1);
            locations.add(randomGenerator.nextInt(7) + 1);

            dotComList.add(new DotCom(locations));
        }
        return dotComList;
    }
    public static void main(String[] args) {
        SimpleDotComGame game = new SimpleDotComGame();
        //String check = game.checkHit(2);
        //System.out.println(check);
        //System.out.println(String.format("You guessed %s times\n", game.getGuesses()));
    }
}
