package com.baudean.headfirst;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DotComTest extends TestCase {

    public void testCheckHit() throws Exception {
        //List<Integer> dotComLocation = Arrays.asList(1, 2, 3);
        List<Integer> dotComLocation = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        DotCom testGame = new DotCom(dotComLocation);
        assertEquals(testGame.checkHit(1), "hit");
        assertEquals(testGame.checkHit(4), "miss");

    }
}